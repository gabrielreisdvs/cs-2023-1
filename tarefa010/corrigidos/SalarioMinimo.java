package tarefa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;

public class SalarioMinimo {
	
	private static final Logger logger = System.getLogger(SalarioMinimo.class.getName());

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salarioMinimo = sc.nextDouble();
		
		double salarioUsuario = sc.nextDouble();
		
		double quantidadeSalarioMinimo = salarioUsuario / salarioMinimo;
		
		logger.log(Level.INFO,quantidadeSalarioMinimo);
	}
	
}
