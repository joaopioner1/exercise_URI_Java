package Exercise;

import java.util.Scanner;

public class Uri1037 {

	public Uri1037() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double numeroInput = in.nextDouble();

		if (numeroInput < 0 || numeroInput > 100) {
			System.out.print("Fora de intervalo");
		
		}else if (numeroInput >= 0 && numeroInput <= 25.0000) {
			System.out.printf("Intervalo [0,25]");
		} else if (numeroInput > 25 && numeroInput <= 50) {
			System.out.printf("Intervalo [25,50]");
		} else if (numeroInput > 50 && numeroInput <= 75) {
			System.out.printf("Intervalo [50,75]");
		} else if (numeroInput > 75 && numeroInput <= 100) {
			System.out.printf("Intervalo [75,100]");

			in.close();
		}
	}
}
