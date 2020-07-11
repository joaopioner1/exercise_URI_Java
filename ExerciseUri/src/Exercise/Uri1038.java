package Exercise;

import java.util.Scanner;

public class Uri1038 {

	public Uri1038() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int codigo = in.nextInt();
		int quantidade = in.nextInt();

		if (codigo == 1) {
			System.out.printf("Total: R$ %.2f\n", quantidade * 4.00);
		}
		if (codigo == 2) {
			System.out.printf("Total: R$ %.2f\n", quantidade * 4.50);
		}
		if (codigo == 3) {
			System.out.printf("Total: R$ %.2f\n", quantidade * 5.00);
		}
		if (codigo == 4) {
			System.out.printf("Total: R$ %.2f\n", quantidade * 2.00);
		}
		if (codigo == 5) {
			System.out.printf("Total: R$ %.2f\n", quantidade * 1.50);
		} else {
			System.out.println("Este número não está entre os códigos.");

			in.close();
		}
	}
}
