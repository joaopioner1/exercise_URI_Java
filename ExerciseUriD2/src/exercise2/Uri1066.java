package exercise2;

import java.util.Scanner;

public class Uri1066 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;

		for (int i = count1; i < 5; i++) {
			int input = in.nextInt();
			if (input < 0) {
				count1 += 1;
			}
			if (input % 2 == 0) {
				count2 += 1;
			}
			if (input % 2 != 0) {
				count3 += 1;
			}
			if (input > 0) {
				count4 += 1;
			}
		}
		System.out.println(count2 + " valor(es) par(es)");
		System.out.println(count3 + " valor(es) impar(es)");
		System.out.println(count4 + " valor(es) positivo(s)");
		System.out.println(count1 + " valor(es) negativo(s)");
		in.close();
	}

}
