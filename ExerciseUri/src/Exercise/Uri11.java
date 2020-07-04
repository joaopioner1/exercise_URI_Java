package Exercise;
import java.util.Locale;
import java.util.Scanner;
public class Uri11 {

	public Uri11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double pi;
		double raio;
		double volume;
		
		pi =  3.14159;
		raio = in.nextDouble();
		
		volume =  (4/3.0) * pi * (raio * raio * raio);
		
		System.out.printf("VOLUME = %.3f\n",volume);
		
		
		in.close();
		
	}

}
