package Exercise;
import java.util.Scanner;
public class Uri15 {

	public Uri15() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
		
		Scanner entrada = new Scanner(System.in);
		
	    double x1 = entrada.nextDouble();
	    double y1 = entrada.nextDouble();
	    double x2 = entrada.nextDouble();
	    double y2 = entrada.nextDouble();
		
	    double conteudo = ((x2 - x1)* (x2 - x1)) +((y2 - y1)*(y2 - y1));
		
	    double distancia = Math.sqrt(conteudo); //Math.sqrt pra fazer raiz quadrada
		
		
		System.out.printf("%.4f\n",distancia);
		
		entrada.close();
	}

}
