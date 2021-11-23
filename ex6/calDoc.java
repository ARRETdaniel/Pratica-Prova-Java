import java.util.Scanner;

public class calDoc {
	public static void main(String[] args) {
		Calculo conta = new Calculo();
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe A & B:");
		int A = ler.nextInt();
		int B = ler.nextInt();
		conta.soma(A, B);
	}
}
