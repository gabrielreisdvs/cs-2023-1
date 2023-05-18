package tarefa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;

public class Numero {
	
	private static final Logger logger = System.getLogger(Numero.class.getName());

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		logger.log(Level.INFO,numero-1 + " ");
		logger.log(Level.INFO,numero+1);
		
	}

}
