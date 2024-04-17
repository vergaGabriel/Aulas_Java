public class exercicio_02 {
    public static void main(String[] args) {
        Pessoa person1 = new Pessoa();
        person1.setNome("Pintovaldo");
        System.out.println(person1.getNome());

        person1.setDataNascimento("26/02/2005");
        System.out.println(person1.getDataNascimento());

        person1.setAltura(1.77);
        System.out.println(person1.getAltura());

        person1.printAll();
    }  
}
