package exercise2;

import java.util.Locale;
import java.util.Scanner;
public class Uri1043 {

	public Uri1043() {
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double valorA = in.nextDouble();
		double valorB = in.nextDouble();
		double valorC = in.nextDouble();
		double perimetro, area;
			
		if (valorC != 2) {
			perimetro = valorA + valorB + valorC;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		}
		else {
			area = ((valorA + valorB) *valorC) / 2;
			System.out.printf("Area = %.1f\n", area);
		}
		
		
		in.close();
	}

}
