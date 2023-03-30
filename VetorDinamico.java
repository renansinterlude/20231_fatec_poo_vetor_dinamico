public class VetorDinamico{
    private int [] elementos;
    private int quantidade;
    private int capacidade;
    public static final int LINEAR_REDUCAO = 4; // constante
    public VetorDinamico(){
      //ajustar a capacidade do VetorDinamico
      capacidade = 4;
      elementos = new int[capacidade];
    }
  
     
  
    //escrever um método que responde se um determinado elemento já existe na coleção
    public boolean existe(int elemento){
      for (int i = 0; i < quantidade; i++)
        if (elementos[i] == elemento)
          return true;
      return false;
    } 
  
    public boolean estaCheio(){
      // if (quantidade >= capacidade)
      //   return true;
      // return false;
      //? :
      // return quantidade >= capacidade ? true : false;
      return quantidade >= capacidade;
    }
  
    public boolean estaVazio(){
      return quantidade <= 0;
    }
  
    public void remover(){
      if(!estaVazio()){
        quantidade--;
        if (capacidade > LINEAR_REDUCAO && quantidade <= capacidade / 4) // garantindo que o vetor tenha no minimo 4 posições e não reduz mais que isso
          redimensionar(0.5); // só vai diminuir tamanho se vetor estiver na metade
      }
    }
  
    public void adicionar(int elemento){
      if(estaCheio())
        redimensionar(2);
      elementos[quantidade] = elemento;
      quantidade++;
      // if(!estaCheio()){
      //   elementos[quantidade] = elemento;
      //   quantidade++;
      // }
    }
  
    private void aumentarCapacidade() {
      //1. alocar um vetor "aux" com o dobro da capacidade
      int [] aux = new int[capacidade * 2];
      //2. fazer um for para copiar todos de elementos para aux
      for (int i = 0; i < quantidade; i++){
        aux[i] = elementos[i];
      }
      //3. fazer com que elementos referencie o objeto referenciado por aux
      elementos = aux;
      //4. dobrar o valor existente na variável capacidade
      capacidade *= 2;
    }
    private void reduzirCapacidade(){
      //1. alocar um vetor "aux" com a metade da capacidade
      int [] aux = new int[capacidade / 2];
      //2. fazer um for para copiar todos de elementos para aux
      for (int i = 0; i < quantidade; i++){
        aux[i] = elementos[i];
      }
      //3. fazer com que elementos referencie o objeto referenciado por aux
      elementos = aux;
      //4. dividir o valor existente na variável capacidade
      capacidade /= 2;
    }
  
    private void redimensionar(double fatorRedimensionamento){
      int [] aux = new int[(int)(capacidade * fatorRedimensionamento)];
      for (int i = 0; i < quantidade; i++){
        aux[i] = elementos[i];
      }
      elementos = aux;
      capacidade = (int)(capacidade * fatorRedimensionamento);
    }
  
    
  
    public void exibir(){
      System.out.printf("Qtde: %d, Cap: %d.%n", quantidade, capacidade);
      for (int i = 0; i < quantidade; i++){
        System.out.print (elementos[i] + " ");
      }
      System.out.printf("%n");
    }
  }