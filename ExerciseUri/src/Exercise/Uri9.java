package Exercise;
import java.util.Locale;
import java.util.Scanner;

public class Uri9 {

	 {
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		String nomeVendedor;
		double salarioFixo, bonus;
		double  salario;
		
		nomeVendedor = in.nextLine();
		salarioFixo = in.nextDouble();
		bonus = in.nextDouble();
		
		salario = (salarioFixo + (bonus*0.15));
		
		
		System.out.printf("TOTAL = R$ %.2f\n",salario);
		
		in.close();
		
		

	}

}
