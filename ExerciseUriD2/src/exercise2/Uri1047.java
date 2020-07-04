package exercise2;
import java.util.Scanner;
public class Uri1047 {

	public Uri1047() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int hInicio = in.nextInt();
		int mInicio = in.nextInt();
		int hFim = in.nextInt();
		int mFim = in.nextInt();
		int totalH = hFim - hInicio;
		int totalM = mFim - mInicio;
		
		if (totalH < 0) {
			totalH = 24 + (hFim - hInicio);
		}
		
		if (totalM < 0) {
			totalM = 60 + (mFim - mInicio);
			totalH--;
		}
		
		if (hInicio == hFim && mInicio == mFim) 
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
	
		else{ System.out.println("O JOGO DUROU "+ totalH + " HORA(S) E " + totalM + " MINUTO(S)");

		in.close();
	}
	}

}
