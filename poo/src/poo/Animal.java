
package poo;

public abstract class Animal {
    
    private int Qpatas;
    private String Cor;
    private boolean Pelo;
    private String Som;
    private String Raca;
    private double Altura;
    private double Largura;
    
    
    public Animal (){}
    public Animal (int qp,String s ){
        Qpatas=qp;
        Som=s;
    } 
    public Animal(int qp, String c, boolean p, String s, String r, double a, double l){
            Qpatas=qp;
            Cor=c;
            Pelo=p;
            Som=s;
            Raca=r;
            Altura=a;
            Largura=l;
        }

    public int getQpatas() {
        return Qpatas;
    }

    public void setQpatas(int Qpatas) {
        this.Qpatas = Qpatas;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public boolean isPelo() {
        return Pelo;
    }

    public void setPelo(boolean Pelo) {
        this.Pelo = Pelo;
    }

    public String getSom() {
        return Som;
    }

    public void setSom(String Som) {
        this.Som = Som;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getLargura() {
        return Largura;
    }

    public void setLargura(double Largura) {
        this.Largura = Largura;
    }

    public abstract String EmitirSom();
    public abstract String Mover();
    
    public String Comer(String tipo){
        return tipo;
    }
}
