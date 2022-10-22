public class Pilha{
  private int capacidade;
  private int topo;
  private int [] dados;

  public Pilha (int capacidade){//construtor
    this.capacidade = capacidade;
    topo = -1;
    dados = new int[capacidade];
  }

  public boolean cheia(){//V ou F
    return (topo + 1 == capacidade);
  }

  
  public void empilha (int d){
    if (! cheia()){
      topo ++;
      dados[topo] = d;
    }
  }
 
  public void imprime(){
    for(int i=0;i<=topo;i++)
      System.out.println(dados[i]);
  }

  public void imprimeaocontrario(){
    for(int i=topo;i>=0;i--)
      System.out.println(dados[i]);
  }

  public boolean vazia(){
    return(topo == -1);
  }
  
  public int desempilha(){
      if(vazia()){
        return 0;
      }
      topo--;
      return dados[topo +1];  
  }
}
