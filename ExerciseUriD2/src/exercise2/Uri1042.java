package exercise2;
import java.util.Scanner;
public class Uri1042 {

	public Uri1042() {
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valorA = input.nextInt();
		int valorB = input.nextInt();
		int valorC = input.nextInt();
		
		if (valorA > valorB && valorA > valorC && valorB > valorC) {
			System.out.println(valorC + "\n" + valorB + "\n" + valorA);
		}
		else if (valorB > valorA && valorB > valorC && valorA > valorC) {
				System.out.println(valorC + "\n" + valorA + "\n" + valorB);
			}
		else if (valorC > valorB && valorC > valorA && valorB > valorA) {
			System.out.println(valorA + "\n" + valorB + "\n" + valorC);
		}
		else if (valorA > valorC && valorA > valorB && valorC > valorB) {
			System.out.println(valorB + "\n" + valorC + "\n" + valorA);
		}
		else if (valorB > valorC && valorB > valorA && valorC > valorA) {
			System.out.println(valorA + "\n" + valorC + "\n" + valorB);
		}
		else if (valorC > valorA && valorC > valorB && valorA > valorB) {
			System.out.println(valorB + "\n" + valorA + "\n" + valorC);
		}
		
		System.out.println("\n" + valorA + "\n" + valorB + "\n" + valorC);
		
		
		input.close();
	}

}
