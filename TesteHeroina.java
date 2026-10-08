public class TesteHeroina {
    public static void main(String[] args) {
    
    Heroina heroina = new Heroina("Hornet");

    System.out.println(heroina);
    heroina.cura();
    heroina.atacar(9);
    System.out.println(heroina);
    heroina.receberDano(4);
    System.out.println(heroina);
    heroina.cura();
    System.out.println(heroina);
    heroina.receberDano(10);
    System.out.println(heroina);

    System.out.println("Derrotada? "+heroina.estaDerrotada());
    }
}
