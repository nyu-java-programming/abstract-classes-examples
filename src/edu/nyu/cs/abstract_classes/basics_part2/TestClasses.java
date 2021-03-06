package edu.nyu.cs.abstract_classes.basics_part2;

public class TestClasses {

	public static void main(String[] args) {
		
		// you cannot instantiate an abstract class!
		//Foo f = new Foo();
		
		// however, you can instantiate a non-abstract child class of an abstract class
		Baz bz1 = new Baz();
		Bar bz2 = new Baz();
		Bar bz3 = new Baz();
		
		Bar[] arr = {bz1, bz2, bz3};
		
		for (Bar obj : arr) {
			obj.doSomething1(); // declared in interface Bar, inherited by Foo, passed on to Baz which implements it
			if (obj instanceof Bar) {
				((Bar) obj).doSomething2(); // declared in class Foo, implemented in class Baz
				((Bar) obj).doSomething3(); // inherited from class Foo
			}
			obj.doSomething4(); // inherited as default method from interface Bar
		}
		

	}

}
