public class Pessoa{
    private String nome, data_nascimento;
    double altura;

    public Pessoa(){};

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDataNascimento(String data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    public String getDataNascimento(){
        return data_nascimento;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public void printAll(){
        System.out.println("Nome: " + nome +" Data de Nascimento: "+ data_nascimento + " Altura: "+ altura);
    }
}