/**
 * 
 */
package com.techstack.designpatterns.creational.singleton;

/**
 * A singleton class should have public visibility so that complete application
 * can use
 * 
 * <p>
 * <b>Static initialization :</b> If you have an idea of the class loading
 * sequence, you can use the fact that static blocks are executed during the
 * loading of a class, even before the constructor is called. We can use this
 * feature in our singleton pattern
 * 
 * This error can be solved using double-checked locking. This principle tells
 * us to recheck the instance variable again in a synchronized block.
 * </p>
 * 
 * @author Karthikeyan N
 *
 */
public class MySingletonImplUsingStaticBlock {

	public static final MySingletonImplUsingStaticBlock INSTANCE;

	private MySingletonImplUsingStaticBlock() {
		/**
		 * private constructor so that class cannot be instantiated from outside this
		 * class
		 */
	}

	static {
        try {
            INSTANCE = new MySingletonImplUsingStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Unable to create single instance", e);
        }
    }
	
	public static MySingletonImplUsingStaticBlock getInstance() {
		return INSTANCE;
	}
}
