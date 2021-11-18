import java.util.Scanner;

public class Exercise09_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c, d, e, f;

        System.out.println("Insira valores para a, b, c, d, e, f:");

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        LinearEquation tester = new LinearEquation(a, b, c, d, e, f);

        if (tester.isSolvable()) {

            System.out.println("x is " + tester.getX());
            System.out.println("y is " + tester.getY());

        } else {
            System.out.println("A equacao nao tem solucao");
        }
        input.close();
    }
}
