import java.util.Scanner;
public class Exercise09_10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insira os valores para a, b e c: ");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double discriminant = quadraticEquation.getDiscriminant();
        System.out.printf("O valor discriminante: %.2f", discriminant);

        if (discriminant > 0) {
            System.out.print(" e os dois valores raiz sao: ");
            System.out.printf("%.5f", quadraticEquation.getRoot1());
            System.out.print("  ");
            System.out.printf("%.5f", quadraticEquation.getRoot2());
        } else if (discriminant == 0) {
            System.out.print(" e o unico valor raiz: ");
            System.out.println(quadraticEquation.getRoot1() + "(Raiz 1)");
        } else {
            System.out.println(" A equacao nao tem raizes.");
        }


    }
}
