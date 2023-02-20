package one.digitalinnovation.gof.singleton;

public class LazySingleton {

	private static LazySingleton instancia;
	
	private LazySingleton() {
		super();
	}
	
	public static LazySingleton getInstancia() {
		if(instancia == null) {
			instancia = new LazySingleton();
		}
		return instancia;
	}
}
