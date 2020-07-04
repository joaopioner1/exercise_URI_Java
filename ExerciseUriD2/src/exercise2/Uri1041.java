package exercise2;
import java.util.Scanner;
public class Uri1041 {

	public Uri1041() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float cordenada1 = input.nextFloat();
		float cordenada2 = input.nextFloat();
		
		if (cordenada1 + cordenada2 == 0) {
			System.out.print("Origem\n");
		} else if (cordenada1 == 0 && cordenada2 != 0){
			 System.out.print("Eixo Y\n");
		} else if (cordenada1 != 0 && cordenada2 == 0) {
			System.out.print("Eixo X\n");
		} else if (cordenada1 > 0 && cordenada2 > 0) {
			System.out.print("Q1\n");
		} else if (cordenada1 < 0 && cordenada2 > 0) {
			System.out.print("Q2\n");
		} else if (cordenada1 < 0 && cordenada2 < 0) {
			System.out.print("Q3\n");
		} 
		else {
			System.out.print("Q4\n");
		}
			 
		
		
		input.close();

		   
	}

}
