package ar.com.codoacodo.interfaces.log;

public class MainLog {

	public static void main(String[] args) {
		String target = "A";
		ILog logger = LogManager.getLogger(target);
		logger.log();
		

	}

}
