import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    Pilha p = new Pilha(100);
    System.out.print("Digite o numero que quer fazer a conversao: ");
    int num = n.nextInt();

    
    while (num > 0)
      {
      p.empilha (num % 2);
      num = num / 2;
      }
     System.out.println("\n");
      p.imprimeaocontrario();
    
  }
}
