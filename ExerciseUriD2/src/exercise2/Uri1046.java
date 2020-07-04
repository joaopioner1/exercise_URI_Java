package exercise2;
import java.util.Scanner;
public class Uri1046 {

	public Uri1046() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int inicio = in.nextInt();
		int fim = in.nextInt();
		int duracao = 24 - (24 + inicio - fim) % 24;
	        if (inicio == fim) {
	            System.out.println("O JOGO DUROU 24 HORA(S)");
	        } else {
	            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
	        }
		
		in.close();
	}

}
