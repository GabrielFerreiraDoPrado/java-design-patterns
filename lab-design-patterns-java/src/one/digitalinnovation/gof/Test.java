package one.digitalinnovation.gof;

public class Test {

	public static void main(String[] args) {
		LazySingleton lazy = LazySingleton.getInstancia();
		LazySingleton lazy2 = LazySingleton.getInstancia();
		System.out.println(lazy == lazy2);
		System.out.println();
		
		EagerSingleton eager = EagerSingleton.getInstancia();
		EagerSingleton eager2 = EagerSingleton.getInstancia();
		System.out.println(eager == eager2);
		System.out.println();
		
		LazySingletonHolder holder = LazySingletonHolder.getInstancia();
		LazySingletonHolder holder2 = LazySingletonHolder.getInstancia();
		System.out.println(holder == holder2);

	}

}
