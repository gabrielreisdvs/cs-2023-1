package tarefa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;

public class Idade {
	
	private static final Logger logger = System.getLogger(Idade.class.getName());

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		logger.log(Level.INFO, "Digite sua idade em anos, meses e dias\n");
		
		logger.log(Level.INFO,"Anos: ");
		int anos = sc.nextInt();
		sc.nextLine();
		anos = anos * 365;
		
		logger.log(Level.INFO,"Meses: ");
		int meses = sc.nextInt();
		sc.nextLine();
		meses = meses * 30;
		
		logger.log(Level.INFO,"Dias: ");
		int dias = sc.nextInt();
		sc.nextLine();
		
		int total = anos + meses + dias;
		
		logger.log(Level.INFO,"Sua idade em dias: " + total);
		
		sc.close();
		
	}
}
