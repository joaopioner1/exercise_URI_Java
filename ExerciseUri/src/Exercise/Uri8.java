package Exercise;
import java.util.Locale;
import java.util.Scanner;
public class Uri8 {

	public Uri8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Agora, em vez de usar vírgulas, o programa usa pontos.
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		 
		int numeroFuncionarios;
		float horasTrabalhadas, valorPorHora, salario;
		
		numeroFuncionarios = entrada.nextInt(); 
		horasTrabalhadas = entrada.nextFloat();
		valorPorHora = entrada.nextFloat();
		
		salario = valorPorHora*horasTrabalhadas;
		
		System.out.println("NUMBER = " + numeroFuncionarios);
		System.out.printf("SALARY = U$ %.2f%n",salario);
		
		entrada.close();
	}
	

}
