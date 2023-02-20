package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.EagerSingleton;
import one.digitalinnovation.gof.singleton.LazySingleton;
import one.digitalinnovation.gof.singleton.LazySingletonHolder;

import one.digitalinnovation.gof.strategy.AggressiveBehavior;
import one.digitalinnovation.gof.strategy.Behavior;
import one.digitalinnovation.gof.strategy.DefensiveBehavior;
import one.digitalinnovation.gof.strategy.NormalBehavior;
import one.digitalinnovation.gof.strategy.Robot;

public class Test {

	public static void main(String[] args) {
		
		//Singleton:
		LazySingleton lazy = LazySingleton.getInstancia();
		LazySingleton lazy2 = LazySingleton.getInstancia();
		System.out.println(lazy == lazy2);
		
		EagerSingleton eager = EagerSingleton.getInstancia();
		EagerSingleton eager2 = EagerSingleton.getInstancia();
		System.out.println(eager == eager2);
		
		LazySingletonHolder holder = LazySingletonHolder.getInstancia();
		LazySingletonHolder holder2 = LazySingletonHolder.getInstancia();
		System.out.println(holder == holder2);
		System.out.println();

		//Strategy:
		Behavior normal = new NormalBehavior();
		Behavior defensive = new DefensiveBehavior();
		Behavior aggressive = new AggressiveBehavior();
		
		Robot robot = new Robot();
		
		robot.setBehavior(normal);
		robot.move();
		robot.setBehavior(defensive);
		robot.move();
		robot.setBehavior(aggressive);
		robot.move();
		System.out.println();
		
		//Facade:
		
		Facade facade = new Facade();
		facade.migrateClient("John", "12345678");
		
	}

}
