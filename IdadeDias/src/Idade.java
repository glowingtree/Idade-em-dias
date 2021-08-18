import java.util.Scanner;

public class Idade {

	
	public static int Dias() {
		int ano;
		int meses;
		int dias;
		int total;
		Scanner s = new Scanner (System.in);
		System.out.println("Digite sua idade em anos");
		ano = s.nextInt();
		ano = ano*365;
		System.out.println("Digite os meses depois do seu aniversário");
		meses =  s.nextInt();
		meses =  meses*30;
		System.out.println("Digite os dias");
		dias = s.nextInt();
		dias = ano + meses + dias;
		
		System.out.println("Sua idade em dias é: " + dias);
		return 0;
		
		
	}
	
	public static void main(String [] args) {
		
		Dias();
	}
}
