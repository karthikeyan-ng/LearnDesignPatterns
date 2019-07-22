/**
 * 
 */
package com.techstack.designpatterns.creational.singleton;

/**
 * A singleton class should have public visibility so that complete application
 * can use
 * 
 * <p><b>Early initialization :</b> In this method, class is initialized whether it is to
 * be used or not. The main advantage of this method is its simplicity. You
 * initiate the class at the time of class loading. Its drawback is that class
 * is always initialized whether it is being used or not.</p>
 * 
 * @author Karthikeyan N
 *
 */
public class MySingletonImplUsingEarlyInitialization {

	// static instance of class globally accessible 
	public static MySingletonImplUsingEarlyInitialization singletonObject = new MySingletonImplUsingEarlyInitialization();
	
	private MySingletonImplUsingEarlyInitialization() {
		/**
		 * private constructor so that class
		 * cannot be instantiated from outside
		 * this class   
		 */
	}
}
