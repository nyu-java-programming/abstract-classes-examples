package edu.nyu.cs.abstract_classes.basics_part2;

/**
 * An interface with a public static constant, an abstract method, and a default method.
 */
public interface Fooable {
	
	/**
	 *  interfaces are restricted to only public final static properties
	 */
	public final static int X = 4;

	/**
	 * interfaces allow abstract methods
	 */
	public abstract void doSomething1();
	
	/**
	 * interfaces allow default methods for a very particular use-case
	 */
	public default void doSomething4() {
		System.out.println("doSomething4");
	}
	
}
