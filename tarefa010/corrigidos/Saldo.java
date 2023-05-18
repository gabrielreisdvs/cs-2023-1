package tarefa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;

public class Saldo {
	
	private static final Logger logger = System.getLogger(Saldo.class.getName());

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();

		valor = valor * 1.15;
		
		logger.log(Level.INFO,valor);
		
		sc.close();
	}
}
