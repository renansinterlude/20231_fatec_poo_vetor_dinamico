import java.util.Random;
public class JogoMegaSena {
  public static void main(String[] args) throws Exception{
    Random gerador = new Random();
    VetorDinamico v = new VetorDinamico();
    while(true){
      //ajustar o intervalo para [1, 60]
      //no intervalo [2,10]
      //somente adicionar se o elemento não existir
      int n;
      do{
          n = 1 + gerador.nextInt(60);
      }while(v.existe(n));
      v.adicionar(n);
      v.exibir();
      System.out.println("*************************");
      Thread.sleep(2000);
    }
  }
}