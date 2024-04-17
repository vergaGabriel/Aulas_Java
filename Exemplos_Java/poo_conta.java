public class Conta {
    private String nro;
    private double sald;
    public Conta(String nro, double saldo){
        this.nro=nro;
        this.saldo=saldo;
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }

    public void sacar(double valor){
        this.saldo-=valor;
    }

    public float getSaldo(){
        return this.saldo;
    }
}

