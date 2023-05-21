package tarefa010;

import java.util.Scanner;

public class Ipi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double ipi = sc.nextDouble();
		
		int codigoPeca1 = sc.nextInt();
		
		double valorPeca1 = sc.nextDouble();
		
		int quantidadePeca1 = sc.nextInt();
		
		int codigoPeca2 = sc.nextInt();
		
		double valorPeca2 = sc.nextDouble();
		
		int quantidadePeca2 = sc.nextInt();
		
		double total = ((valorPeca1 * quantidadePeca1) + (valorPeca2 * quantidadePeca2)) * (ipi/100 + 1);
		
		System.out.println(total);
		
		
	}
	
}
