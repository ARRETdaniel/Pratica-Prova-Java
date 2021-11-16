public class avgCal {
  // Prog JAVA que calcule a média de quatro notas. O programa deve mostrar o valor da
  // média e indicar se foi aprovado ou reprovado
  public static void main(String[] args) {
    float n = 4, result = 0;

    float a[] = new float[4];
    a[0] = 8.0f;
    a[1] = 6.5f;
    a[2] = 7.0f;
    a[3] = 6.0f;
    for (int i = 0; i < n; i++)
      result = result + a[i];
    System.out.println("media de (" + a[0] + "," + a[1] + "," + a[2] + "," + a[3] + ")  eh = " + result / n);

    if ((result / n) >= 6) {
      System.out.println("Aprovado");
    } else if ((result / n) < 6) {
      System.out.println("Repro");
    }
  }
}
