package tarefa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class MediaAritmetica {
	
	private static final Logger logger = System.getLogger(MediaAritmetica.class.getName());

	public static void main(String[] args) {
		double media1 = (8+9+7)/3.0;
		logger.log(Level.INFO,media1);
		
		double media2 = (4+5+6)/3.0;
		
		double total = media1 + media2;
		
		logger.log(Level.INFO,total);
		
		logger.log(Level.INFO,total/2);

		
	}

}
