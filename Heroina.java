public class Heroina {
  
    private  String nome;
    private  int mascaras=5;
    private int seda;
    private final static int MIN_MASCARAS=0;
    private final static int MAX_MASCARAS=5;
    private final static int MIN_SEDA=0;
    private final static int MAX_SEDA=9;


    public Heroina(String nome) {
        this.nome = nome;
    }

    
    public String getNome(){
        return nome;
    }

    public int getMascaras(){
        return mascaras;
    }

    public int getSeda(){
        return seda;
    }


    
    
    public void atacar(){
        System.out.println(nome + " ataca com a agulha!");
        if(seda < MAX_SEDA){
            seda++;
          }  
    }

    public void atacar(int vezes){
        for(int i=0; i<vezes; i++){
            atacar();
          
          }  
        }

    public void receberDano(int dano){
        if(dano >= mascaras){
            mascaras = 0;
        }
        else{
            mascaras = mascaras - dano;
        }
        System.out.println(nome +" recebeu "+ dano +" de dano.");
    }

    public void cura(){
        if(seda == MAX_SEDA){
            mascaras = Math.min(mascaras + 3, MAX_MASCARAS);
            System.out.println(nome + " se amarrou com seda e recuperou mascaras.");
            seda = 0;
        }
        else{
            System.out.println(nome +" nao tem seda suficiente para se curar.");
        }
    }

    public boolean estaDerrotada(){
    return mascaras == MIN_MASCARAS;
    }

   
    @Override
    public String toString(){
        return String.format("%s | Mascaras: %d/%d | Seda: %d/%d",nome, mascaras , MAX_MASCARAS, seda, MAX_SEDA);
    }


}



