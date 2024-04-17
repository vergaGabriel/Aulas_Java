public class Conta {
    private double saldo;
    public Conta() {}
    public Conta(double saldo){
        this.saldo=saldo;
    }

    public static void main(String[] args){
        Conta c1=new Conta();
        Conta c2=new Conta(100);
    }
}