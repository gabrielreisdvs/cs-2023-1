package tarefa010;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade em anos, meses e dias");
		
		System.out.print("Anos: ");
		int anos = sc.nextInt();
		sc.nextLine();
		anos = anos * 365;
		
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		sc.nextLine();
		meses = meses * 30;
		
		System.out.print("Dias: ");
		int dias = sc.nextInt();
		sc.nextLine();

		int total = anos + meses + dias;
		
		System.out.println("Sua idade em dias: " + total);
		
		sc.close();
		
	}
}
