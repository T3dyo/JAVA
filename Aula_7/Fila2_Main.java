class Main {
  public static void main(String[] args) {
   FilaCircular f = new FilaCircular();

     FilaPessoa p=new FilaPessoa(20,'M',"Marcelo");
     FilaPessoa q=new FilaPessoa(10,'M',"Ronaldo");
     FilaPessoa r=new FilaPessoa(30,'M',"Richard");
     FilaPessoa s=new FilaPessoa(40,'M',"Eduardo");
     FilaPessoa t=new FilaPessoa(50,'M',"Joao");

      f.enfileira(p);
      f.enfileira(q);
      f.enfileira(r);
      f.enfileira(s);
      f.enfileira(t);
   System.out.println("\nTotal de pessoa(s) na fila:"+ f.conta());
    f.imprime();
    }
  }
