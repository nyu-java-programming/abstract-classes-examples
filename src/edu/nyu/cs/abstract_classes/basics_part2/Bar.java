package edu.nyu.cs.abstract_classes.basics_part2;

/**
 * An abstract class that implements an interface.
 * In this case, the abstract class does not need to implement the 
 * abstract methods in the interface.
 * But any concrete class descended from this class must have an
 * implemented version of abstract methods from the interface.
 */
public abstract class Bar implements Fooable {
	
	/**
	 * abstract classes allow public static final properties...
	 */
	public static final int X = 4;
	
	/**
	 * ... but... abstract classes allow any properties to be created, including non-static and private
	 */
	private int y = 10;
	
	/**
	 * An abstract method, just to show that we can have them in abstract classes.
	 */
	public abstract void doSomething2();

	/**
	 * A concrete method, just to show that we can also have these in an abstract class.
	 * In fact, an abstract class can have any type of property or method.
	 */
	public void doSomething3() {
		System.out.println("doSomething3");
	}

}
