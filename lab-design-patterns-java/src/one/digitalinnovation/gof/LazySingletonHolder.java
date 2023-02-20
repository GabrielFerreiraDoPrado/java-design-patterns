package one.digitalinnovation.gof;

public class LazySingletonHolder {

	private static class InstanceHolder {
		public static LazySingletonHolder instancia = new LazySingletonHolder();
	}
	
	private LazySingletonHolder() {
		super();
	}
	
	public static LazySingletonHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
