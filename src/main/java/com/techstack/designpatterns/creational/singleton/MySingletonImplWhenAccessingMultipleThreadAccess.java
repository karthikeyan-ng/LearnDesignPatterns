/**
 * 
 */
package com.techstack.designpatterns.creational.singleton;

/**
 * A singleton class should have public visibility so that complete application
 * can use
 * 
 * <p>
 * <b>Lazy initialization :</b> Suppose there are two threads T1 and T2. Both
 * come to create the instance and check if “instance==null”. Now both threads
 * have identified instance variable as null thus they both assume they must
 * create an instance. They sequentially go into a synchronized block and create
 * the instances. In the end, we have two instances in our application.
 * 
 * This error can be solved using double-checked locking. This principle tells
 * us to recheck the instance variable again in a synchronized block.
 * </p>
 * 
 * @author Karthikeyan N
 *
 */
public class MySingletonImplWhenAccessingMultipleThreadAccess {

	// static instance of class globally accessible 
	public static MySingletonImplWhenAccessingMultipleThreadAccess singletonObject = null;
	
	private MySingletonImplWhenAccessingMultipleThreadAccess() {
		/**
		 * private constructor so that class
		 * cannot be instantiated from outside
		 * this class   
		 */
	}
	
	public static MySingletonImplWhenAccessingMultipleThreadAccess getInstance() {
		if (singletonObject == null) {
            synchronized (MySingletonImplWhenAccessingMultipleThreadAccess.class) {
                // Double check
                if (singletonObject == null) {
                	singletonObject = new MySingletonImplWhenAccessingMultipleThreadAccess();
                }
            }
        }
        return singletonObject;
	}
}
