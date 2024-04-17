public class Carro {
     String nome;
     String marca;
     int ano;
     int velocidade;

     public Carro(){};
   
     public void acelerar(int aceleracao){
          velocidade += aceleracao;
     }

     public void freiar(int reducao){
          velocidade -= reducao;
     }

     public void buzinar(){
          System.out.println("bibi fonfon");
     }
}
