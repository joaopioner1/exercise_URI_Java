package Exercise;
import java.util.Scanner;
public class Uri7 {

	public Uri7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Variáveis
		int A;
		int B;
		int C;
		int D;
		int DIFERENCA;
		//le os valores
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		D = in.nextInt();
		
		DIFERENCA = (A * B - C * D);
		//Mostra imagem na tela
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		in.close();
	}
	

}
