package Exercise;
import java.util.Locale;
import java.util.Scanner;
public class Uri10 {

	public Uri10() {
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
        
		int A = entrada.nextInt();
        int B = entrada.nextInt();
        double C = entrada.nextDouble();
        int D = entrada.nextInt();
        int E = entrada.nextInt();
        double F = entrada.nextDouble();
        
        double resultado = (B*C)+(E*F);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",resultado);
        
        entrada.close();
		
				}

}
