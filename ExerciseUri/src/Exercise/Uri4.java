package Exercise;
import java.util.Scanner;
public class Uri4 {

	public Uri4() {
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int A, B;
		
		A = in.nextInt();
		B = in.nextInt();
		
		int PROD;
		
		PROD = A * B;
		
		System.out.println("PROD = " + PROD);
		
		in.close();
		
	}

}
