
package poo;

public class Cabrito extends Animal {
    private boolean Chifre;
    
    public Cabrito(){
        super();
    }

    public Cabrito(boolean Chifre) {
        this.Chifre = Chifre;
    }

    public Cabrito(boolean Chifre, int qp, String s) {
        super(qp, s);
        this.Chifre = Chifre;
    }

    public Cabrito(boolean Chifre, int qp, String c, boolean p, String s, String r, double a, double l) {
        super(qp, c, p, s, r, a, l);
        this.Chifre = Chifre;
    }

    public boolean isChifre() {
        return Chifre;
    }

    public void setChifre(boolean Chifre) {
        this.Chifre = Chifre;
    }

    @Override
    public String Comer(String tipo) {
        return tipo + " e entorca a boca"; 
    }

    @Override
    public String EmitirSom() {
        return getSom();
    }

    @Override
    public String Mover() {
        return "Andando com as " + getQpatas() +  " patas"; 
    }
    
    
    
    
}
