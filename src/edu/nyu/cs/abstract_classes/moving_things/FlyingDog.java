package edu.nyu.cs.abstract_classes.moving_things;

import java.nio.file.Paths;
import processing.core.*;

/**
 * A representation of a flying dog, which inherits from the abstract class, MovingThing
 * @author Foo Barstein
 * @version 2
 *
 */
public class FlyingDog extends MovingThing {

	/**
	 * Platform-agnostic way to reference a filepath
	 */
	private final static String DOG_IMAGE_PATH  = Paths.get(Paths.get("").toAbsolutePath().toString(), "images", "dog.jpg").toString(); //the image file, in a platform-appropriate file path

	/**
	 * Constructor that takes a reference to the App object that Processing automatically instantiates from the App class
	 * @param app A reference to the App object, which contains lots of useful methods inherited from the PApplet class.
	 */
	public FlyingDog(App app) {
		super(app, DOG_IMAGE_PATH);
		int newX = (int) (Math.random() * app.width);
		this.setX(newX);
		int newY = (int) (Math.random() * app.height);
		this.setY(newY);
		
		int newSpeedX = (int) (Math.random() * 10);
		this.setSpeedX(newSpeedX);
	}
	
	/**
	 * Update the position of this FlyingDog.  This is an implementation of the abstract class, MovingThing's abstract method move().
	 */
	@Override
	public void move() {
		// hard-coded change in x position
		int dx = this.getSpeedX();
		this.setX(this.getX() + dx);
		
		// bounds checking - wrap the dog around the screen if it goes too far to the right
		if (this.getX() > this.getApp().width) {
			// reset to zero
			this.setX(0);
		}
		
	}
	
}
