public class bibli {
  public static void main(String[] args) {
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];

    p[0] = new Pessoa("Terra", 22, "m");
    // p[1] = new Pessoa("dan2iel", 22, "m");

    l[0] = new Livro("POO", "Daniel Terra", 231, p[0]);

    l[0].abrir();
    l[0].folhear(200);
    l[0].avancarPag();

    System.out.println(l[0].detalhes());
  }
}
