package exercise2;

import java.util.Scanner;

public class Uri1040 {

	public Uri1040() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double nota1 = (input.nextDouble() * 2) / 10;
		double nota2 = (input.nextDouble() * 3) / 10;
		double nota3 = (input.nextDouble() * 4) / 10;
		double nota4 = (input.nextDouble() * 1) / 10;
		double nota5;
		double media = nota1 + nota2 + nota3 + nota4;

		if (media * 10 - Math.floor(media * 10) > 0.5001) {
			media = Math.ceil(media * 10) / 10;
		}

		else {
			media = Math.floor(media * 10) / 10;
		}

		System.out.printf("Media: %.1f\n", media);
		if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		if (media >= 7.0) {
			System.out.printf("Aluno aprovado.\n");
		} else if (media >= 5.0) {
			System.out.printf("Aluno em exame.\n");
			nota5 = input.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", nota5);
			media = (media + nota5) / 2;
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", media);

		}
		input.close();

	}

}
