package Exercise;
import java.util.Scanner;
public class Uri16 {

	public Uri16() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int distanciaKm = in.nextInt();
		int tempo;
		
		tempo = distanciaKm * 2;
		
		System.out.println(tempo + " minutos");
		
		
		
		in.close();
	}

}
