package exercise2;
import java.util.Locale;
import java.util.Scanner;
public class Uri1048 {

	public Uri1048() {
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		float valorInput = in.nextFloat();
		float percentual;
		
		if (valorInput >= 0 && valorInput <= 400) {
			percentual = (valorInput * 15) / 100;
			
			System.out.printf("Novo salario: %.2f\n",(valorInput + percentual));
			System.out.printf("Reajuste ganho: %.2f\n",percentual);
			System.out.println("Em percentual: 15 %");
		} 
		else if (valorInput > 400 && valorInput <= 800)  {
			percentual = (valorInput * 12) / 100;
			
			System.out.printf("Novo salario: %.2f\n",(valorInput + percentual));
			System.out.printf("Reajuste ganho: %.2f\n",percentual);
			System.out.println("Em percentual: 12 %");
		}
		else if (valorInput > 800 && valorInput <= 1200) {
			percentual = (valorInput * 10) / 100;
			
			System.out.printf("Novo salario: %.2f\n",(valorInput + percentual));
			System.out.printf("Reajuste ganho: %.2f\n",percentual);
			System.out.println("Em percentual: 10 %");
		}
		else if (valorInput > 1200 && valorInput <= 2000) {
			percentual = (valorInput * 7) / 100;
			
			System.out.printf("Novo salario: %.2f\n",(valorInput + percentual));
			System.out.printf("Reajuste ganho: %.2f\n",percentual);
			System.out.println("Em percentual: 7 %");
		}
		else if (valorInput > 2000) {
			percentual = (valorInput * 4) / 100;
			
			System.out.printf("Novo salario: %.2f\n",(valorInput + percentual));
			System.out.printf("Reajuste ganho: %.2f\n",percentual);
			System.out.println("Em percentual: 4 %");
		}
		in.close();
	}

}
