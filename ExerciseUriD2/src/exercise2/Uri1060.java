package exercise2;
import java.util.Scanner;
public class Uri1060 {

	public Uri1060() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cont = 0;
        for (int i=0; i < 6; i++) {
        	double n = in.nextDouble();
        	if (n > 0) cont++;
        }
        System.out.println(cont + " valores positivos");
        in.close();
	}

}
