class Main {
  public static void main(String[] args) {
    Lista l = new Lista();
    No n;
    
     n = new No(5);
    l.insereNoFinal(n);
    
     n = new No(6);
    l.insereNoFinal(n);
    l.imprime();
    
    
  }
}
