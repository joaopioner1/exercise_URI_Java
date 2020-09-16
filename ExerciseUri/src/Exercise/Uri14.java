package Exercise;
import java.util.Scanner;
public class Uri14 {

	public Uri14() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
        
		int x = leitor.nextInt();
                double y = leitor.nextDouble();
                double media = x / y;
   //Use String. Format se você precisar inserir o valor de um objeto, uma variável ou uma expressão em outra cadeia de caracteres
        System.out.println(String.format("%.3f km/l", media));   

        leitor.close();
	}

}
 
