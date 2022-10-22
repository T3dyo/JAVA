public class FilaCircular{
  int inicio;
  int fim;
  int capacidade;
  FilaPessoa dados [];

  public FilaCircular(){//construtor
    inicio = 0; 
    fim = 0; 
    capacidade = 6; 
    dados = new FilaPessoa[capacidade];
  }

  public void enfileira (FilaPessoa n){
    
    fim = (fim+1)%capacidade;
    dados[fim] = n;

  }
   public FilaPessoa desenfileira(){
    inicio = (inicio+1)%capacidade;
    return dados[inicio];
  }

    public void imprime(){
    int aux;
    for(int i=1;i<=conta();i++)
      {
      aux = (inicio + i) % capacidade;
      dados[aux].imprime();
      }
  }

  public int conta(){
    if(inicio < fim){
    return (fim - inicio);
    }
    else {
      return ( capacidade - inicio + fim);
    }
  }

  public boolean cheia (){
    if (inicio == (fim+1) % capacidade) return true;
    return false;
  }

  public boolean vazia (){
    if (inicio == (fim+1) % capacidade) return true;
    return false;
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

