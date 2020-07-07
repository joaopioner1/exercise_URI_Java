package exercise2;

import java.util.Scanner;

public class Uri1065 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int count = 0;
		for (int i = count; i < 5; i++) {
			int n = in.nextInt();
			if (n % 2 == 0) {
				count += 1;
			}
		}
		System.out.println(count + " valores pares");

		in.close();
	}

}
