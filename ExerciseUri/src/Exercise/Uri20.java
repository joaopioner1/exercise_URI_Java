package Exercise;
import java.util.Scanner;
public class Uri20 {

	public Uri20() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idadeDias = in.nextInt();
		
		int ano = (idadeDias / 365);
		idadeDias = idadeDias % 365;
		
		int meses = (idadeDias / 30);
		idadeDias = idadeDias % 30;
		
		int dias = idadeDias;
		
		System.out.println(ano + " ano(s)" + "\n" + meses + " mes(es)" + "\n" + dias + " dia(s)");
		
		in.close();
	}

}
