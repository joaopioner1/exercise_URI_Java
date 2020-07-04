package Exercise;

import java.util.Scanner;

public class Uri2 {

	public Uri2() {

	}

	public static void main(String[] args) {
		
	      Scanner in = new Scanner(System.in);
	     double pi, area, raio; 
	      
	      pi = 3.14159;
	      raio = in.nextDouble();
	      
	      area = pi * raio * raio;
	       System.out.printf("A=%.4f\n",  area);
	       
	       in.close();
		
	}

}
