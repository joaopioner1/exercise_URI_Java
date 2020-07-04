package Exercise;

import java.util.Scanner;
public class Uri19 {

	public Uri19() {
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tempoSegundos = input.nextInt();
		int horas;
		int minutos;
		int segundos;
		int a, b, c;
		
		a = (horas = tempoSegundos / 3600);
		tempoSegundos = tempoSegundos % 3600;
		
		b = (minutos = tempoSegundos / 60);
		tempoSegundos = tempoSegundos % 60;
		
		c = (segundos = tempoSegundos );
		System.out.println(a + ":" + b + ":" + c);
		
		input.close();
		
	}

}
