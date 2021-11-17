public class Casas {
  public String endereco;
  public String cor;
  private int num;
  protected boolean fechadura;

  public Casas(String endereco, String cor, int num) { // constuctir name
    this.endereco = endereco;
    this.cor = cor;
    this.setCor(cor); //
    this.setNum(num);
    this.abrir();

  }

  // metodos
  public boolean fechar() {
    return this.fechadura = true;
  }

  public boolean abrir() {
    return this.fechadura = false;
  }

  public void status() {
    System.out.println("\n -----------");
    System.out.println("\n endereco: " + this.endereco);
    System.out.println("\n casa cor: " + this.cor);
    System.out.println("\n Esta fechada? " + this.fechadura);
    System.out.println("\n num casa: " + this.num);
    // System.out.println("\n Carga:" + this.carga);
    System.out.println("\n -----------");

  }

  public void entrar() {
    if (this.fechadura == true) {
      System.out.println("\n ERRO! Nao posso entrar");
    } else {
      System.out.println("\n Estou entrando");
    }
  }

  // metodo get set
  public String getEndereco() {
    return this.endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public float getNum() {
    return this.num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public boolean isFechadura() {
    return this.fechadura;
  }

  public boolean getFechadura() {
    return this.fechadura;
  }

  public void setFechadura(boolean fechadura) {
    this.fechadura = fechadura;
  }

}
