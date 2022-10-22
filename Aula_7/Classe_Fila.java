public class Fila{
  int inicio;
  int fim;
  int capacidade;
  FilaPessoa dados [];

  public Fila(){//construtor
    inicio = -1; 
    fim = -1; 
    capacidade = 10; 
    dados = new FilaPessoa[capacidade];
  }

  public void enfileira (FilaPessoa n){
    if(!cheia()){
    fim ++;
    dados[fim] = n;
    }
  }

  public FilaPessoa desenfileira(){
    inicio ++;
    return dados[inicio];
  }

    public void imprime(){
    for(int i=inicio+1;i<=fim;i++)
      {
      dados[i].imprime();
      }
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
  
  public void desmembraIdoso(Fila idoso, Fila naoIdoso){
    for(int i=inicio+1;i<=fim;i++){
      if(dados[i].idade >= 60){
       idoso.enfileira(dados[i]);
        desenfileira();}
      else {
        naoIdoso.enfileira(dados[i]);       
      }
      }
    }
  }

