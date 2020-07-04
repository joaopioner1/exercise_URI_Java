package Exercise;
import java.util.Locale;
import java.util.Scanner;
public class Uri12 {

	public Uri12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		double A;
		double B;
		double C;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		double pi;
		
		pi = 3.14159;
		
		A = in.nextDouble();
		B =	in.nextDouble();	
		C = in.nextDouble();
		
		triangulo = (A*C) / 2;
		circulo = pi * (C*C);
		trapezio = (A+B) * C / 2;
		quadrado = (B*B);
		retangulo = (A*B);
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n",retangulo);
		
		
		in.close();
	}

}
