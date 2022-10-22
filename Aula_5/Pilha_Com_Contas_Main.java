class Main {
  public static void main(String[] args) {
    String expressao = "55*";
    Pilha p = new Pilha(1000);

    for(int i=0;i<expressao.length();i++)
      {
      char aux = expressao.charAt(i);
        if(aux >= '0' && aux <= '9')
        {
          p.empilha(aux - '0');// char para numero
        }
        else
        {
          int a = p.desempilha();
          int b = p.desempilha();
          int resultado = 0;
          if (aux == '+')
          {
            resultado = a + b;
          }
          else if (aux == '-')
          {
            resultado = a - b;
          }
          else if (aux == '*')
          {
            resultado = a * b;
          }
          else if (aux == '/')
          {
            resultado = a / b;
          }
          p.empilha(resultado);
        }
        
      }
    System.out.println(p.desempilha());
  
    
  }
}
