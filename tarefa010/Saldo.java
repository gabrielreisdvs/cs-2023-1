package tarefa010;

import java.util.Scanner;

public class Saldo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();

		valor = valor * 1.15;
		
		System.out.println(valor);
		
		sc.close();
	}
}
