import javax.swing.JOptionPane;

class Pessoa {
    private String name;
    private int age;
    private String number;
    public Pessoa(String n, int i, String f){
        name=n;
        age=i;
        number=f;
    }
    public void new_number(String f){
        number=f;
    }
    public void new_number(){
        number=JOptionPane.showInputDialog("Novo Fone: ");
    }
    public String nro_number(){
        return number;
    }
}

public class aula_07_01 {
    public static void main(String[] args){
        Pessoa amigo= new Pessoa("Joao", 33, "2223311");
        amigo.new_number("44444");
        amigo.new_number();
    }
}