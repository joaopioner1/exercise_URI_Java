package exercise2;
import java.util.Scanner;
public class Uri1044 {

	public Uri1044() {
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	    int A = in.nextInt();
	    int B = in.nextInt();
      
	    if (A % B == 0 || B % A == 0) {
        	System.out.println("Sao Multiplos");
	    } else {
	        System.out.println("Nao sao Multiplos");
	        }
		
		
		in.close();
	}

}
