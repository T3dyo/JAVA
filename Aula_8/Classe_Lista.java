public class Lista{
  No inicio;

  public Lista(){ //construtor
    inicio = null;
  }

  //metodos
 public void insereNoFinal(No aux){
   if(vazia()){
     inicio = aux;
   }
   else {
     No atual;
     atual = inicio;
     while(atual.prox!=null){
       atual = atual.prox;
     }
     atual.prox=aux;
   }
 }

  public boolean vazia (){
    return (inicio == null);
  }

  public void imprime(){
    No atual;
     atual = inicio;
     while(atual!=null){
       atual.imprime();
       atual = atual.prox;
     }
}
}
