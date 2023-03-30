import java.util.Random;
public class TesteRedimensionamento {
  public static void main(String[] args)  throws Exception{
    //70% adicionar um elemento
    //30% remover um elemento
    Random gerador = new Random();
    VetorDinamico v = new VetorDinamico();
    while (true){
      double oQueFazer = gerador.nextDouble();
      if(oQueFazer <= 0.55){
        System.out.println("Adicionando elemento...");
        int n = gerador.nextInt(1, 11); // numero onde começa e onde termina
        v.adicionar(n);
      }
      else{
        System.out.println("Removendo elemento...");
        v.remover();
      }
      v.exibir();
      System.out.println("*************************************************");
      Thread.sleep(2000);
    }
  }
}