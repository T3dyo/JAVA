public class Fila{
  int inicio;
  int fim;
  int capacidade;
  int dados [];

  public Fila(){//construtor
    inicio = -1; 
    fim = -1; 
    capacidade = 4; 
    dados = new int[4];
  }

  public void enfileira (int n){
    if(!cheia()){
    fim ++;
    dados[fim] = n;
    }
  }

  public int desenfileira(){
    inicio ++;
    return dados[inicio];
  }

  public void imprime(){
    for(int i=inicio+1;i<=fim;i++)
      {
        System.out.print(dados[i] + " ");
      }
    System.out.print('\n');
  }

  public int conta(){
    return fim - inicio;
  }

  public boolean cheia (){
    return (fim == capacidade - 1);
  }

  public boolean vazia (){
    return conta() == 0;
  }
  
}
