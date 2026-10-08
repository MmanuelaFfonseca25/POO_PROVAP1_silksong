import javax.swing.JOptionPane;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args)throws Exception  {
    Scanner scanner = new Scanner(System.in);
    int turno=1;
    boolean fugiu=false;

    System.out.println("================================");
    System.out.println("    HOLLOW KNIGHT: SILKSONG\n     edicao POO em Java");
    System.out.println("================================");
    
    String nomejogador = JOptionPane.showInputDialog(null, "Digite seu nome: ");
     System.out.println("Carregando save de " + nomejogador + "...");
     

     Heroina heroina = new Heroina("Hornet");
      System.out.println(heroina);

     Inimigo chefe = new Inimigo("Moss Mother", 12, 1);

        do{
            System.out.println("========== Turno " + turno +" ==========");
            System.out.println(heroina);
            System.out.println(chefe);
            System.out.println("1-Atacar  2-Curar  0-Fugir");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    heroina.atacar();
                    chefe.receberGolpe();
                    break;
                case 2:
                    heroina.cura();
                    break;
                case 0:
                    System.out.println(heroina.getNome()+" fugiu da batalha.");
                    fugiu = true;
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;

                  
            }
            

            if(!chefe.estaDerrotado() && fugiu == false && turno % 3 == 0){
                System.out.println(chefe.getNome()+" ataca!");
                heroina.receberDano(chefe.getDano());
            }
            turno++;
            Thread.sleep(1000);
        }while (!chefe.estaDerrotado()  && !heroina.estaDerrotada() && fugiu == false);
        if(chefe.estaDerrotado()){
            System.out.println("Vitoria sobre "+chefe.getNome()+"!");
        }
        else{ 
            System.out.println("Fim de jogo.");
        }
        
    
    System.out.println(heroina);
       scanner.close();
    }

}