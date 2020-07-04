package Exercise;

import java.util.Scanner;

public class Uri6 {

	public Uri6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
        double notaA = entrada.nextDouble();
        double notaB = entrada.nextDouble();
        double notaC = entrada.nextDouble();
        double MEDIA;
      
        MEDIA = (notaA*2 + notaB*3 + notaC*5) / 10.0;
        
        System.out.printf("MEDIA = %.1f%n", MEDIA);
        
        entrada.close();

	}
	
} 
