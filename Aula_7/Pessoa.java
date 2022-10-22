class FilaPessoa{//nao eh uma fila
  int idade;
  char sexo;
  String nome;

  FilaPessoa(int i,char c, String n){
    idade = i;
    sexo=c;
    nome=n;
  }

  void imprime(){
    System.out.println("Nome="+nome+ " "+"Idade="+idade+ " "+"Sexo="+ sexo);
  }
}
