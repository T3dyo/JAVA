class Main{
public static void main(String[] args) {
   Fila f = new Fila();
    f.enfileira (9);
    f.enfileira (18);
    f.enfileira (27);
    f.enfileira (36);
     f.imprime();
  
  
  System.out.println("\nTotal de pessoa(s) na fila:"+ f.conta());
    
    f. desenfileira();
     f.imprime();
    f. desenfileira();
     f.imprime();
  }
}
