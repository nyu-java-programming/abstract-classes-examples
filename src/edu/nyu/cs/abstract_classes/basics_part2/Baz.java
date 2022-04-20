package edu.nyu.cs.abstract_classes.basics_part2;

/**
 * A regular class that extends an abstract class.
 * This class must implement any abstract methods declared in an ancestor class.
 */
public class Baz extends Bar {
	
	/**
	 * implementation of the abstract method declared in interface Bar
	 */
	public void doSomething1() {
		System.out.println("doSomething1");
	}
	
	/**
	 * implementation of the abstract method declared in class Foo
	 */
	public void doSomething2() {
		System.out.println("doSomething2");
	}

}
