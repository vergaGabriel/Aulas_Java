public class Aula10_ex01{
    public static void main(String args[]){
        Conta ex1 = new Conta();
        ex1.setNumero("12938");
        ex1.setSaldo(384.0);
        ex1.getAll();

        Conta ex2 = new Conta("1231232", 1293.0);
        ex2.getAll();
    }
}