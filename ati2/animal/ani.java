public class ani {
  public static void main(String[] args) {

    Mamifero m = new Mamifero();

    m.setPeso(35.3f);
    m.locomover();
    m.alimentar();
    System.out.println("peso: " + m.getPeso());
  }
}
