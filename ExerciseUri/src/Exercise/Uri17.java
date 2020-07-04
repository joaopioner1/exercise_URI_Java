package Exercise;
import java.util.Locale;
import java.util.Scanner;
public class Uri17 {

	public Uri17() {
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int tempoGasto;
		int velocidadeMedia;
		float distancia;
		float litros;
		
		tempoGasto = input.nextInt();
		velocidadeMedia = input.nextInt();
		
		distancia = tempoGasto * velocidadeMedia;
	    litros = distancia / 12;
	    
	    System.out.printf("%.3f", litros);
	    
	    input.close();

	}

}
