package exercise2;

import java.util.Scanner;

public class Uri1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;

		while (x < y) {
			x = x + 1;
			if (x % 2 == 1 || x % 2 == -1)
				soma = soma + x;
		}
		while (x > y) {
			x = x - 1;
			if (x % 2 == 1 || x % 2 == -1)
				soma = soma + x;
		}
		System.out.println(soma);

		sc.close();
	}

}
