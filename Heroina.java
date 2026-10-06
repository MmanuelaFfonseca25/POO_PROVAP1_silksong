public class Heroina {
  
    private  String nome;
    private  int mascaras;
    private int seda;
    private final static int MIN_MASCARAS=0;
    private final static int MAX_MASCARAS=5;
    private final static int MIN_SEDA=0;
    private final static int MAX_SEDA=9;

    
    public Heroina(String nome) {
        this.nome = nome;
    }

    public Heroina(){

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
   
    @Override
    public String toString(){
        return String.format("%s | Mascaras: %d/%d | Seda: %d/%d",nome, mascaras , MAX_MASCARAS, seda, MAX_SEDA);
    }

 

}

