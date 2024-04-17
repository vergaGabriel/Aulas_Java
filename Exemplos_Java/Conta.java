public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo){
        setNumero(numero);
        setSaldo(saldo);
    }

    public Conta(){}

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void addCredito(double valor){
        this.saldo += valor;
    }

    public void rmDebito(double valor){
        this.saldo -= valor;
    }

    public void getAll(){
        System.out.println("Número: "+ this.numero);
        System.out.println("Saldo: "+ this.saldo);
    }
}