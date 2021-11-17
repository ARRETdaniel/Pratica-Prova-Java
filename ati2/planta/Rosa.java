public class Rosa extends Planta {
  private String cor;
  private float tamanho;

  public void tamanhoAumento(float aum) {
    this.tamanho += aum;
  }
  // get set

  // contruct

  public Rosa(String cor, float tamanho, String nome, int idade) {
    this.cor = cor;
    this.tamanho = tamanho;
    setNome(nome);
    setIdade(idade);

  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public float getTamanho() {
    return this.tamanho;
  }

  public void setTamanho(float tamanho) {
    this.tamanho = tamanho;
  }

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + ", idade='" + getIdade() + "'" + ",cor='" + getCor() + "'" + ", sexo='"
        + getSexo() + "'" + "}";
  }
}
