package Exercise;
import  java.util.Scanner; 
public class Uri5 {

	public Uri5() {
	}

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
	        double nota1 = entrada.nextDouble();
	        double nota2 = entrada.nextDouble();
	        double MEDIA;
	      
	        MEDIA = (nota1*3.5 + nota2*7.5)/11;
	        
	        System.out.printf("MEDIA =%.5f/n" + MEDIA);
	        
	        entrada.close();
	        				
	        	

	}

}
