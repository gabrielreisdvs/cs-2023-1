package tarefa010;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salarioMinimo = sc.nextDouble();
		
		double salarioUsuario = sc.nextDouble();
		
		double quantidadeSalarioMinimo = salarioUsuario / salarioMinimo;
		
		System.out.println(quantidadeSalarioMinimo);
	}
	
}
