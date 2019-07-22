/**
 * 
 */
package com.techstack.designpatterns.creational.singleton;

/**
 * A singleton class should have public visibility so that complete application
 * can use
 * 
 * <p>
 * <b>Lazy initialization :</b> In this method, class in initialized only when
 * it is required. It can save you from instantiating the class when you don’t
 * need it. Generally, lazy initialization is used when we create a singleton
 * class.
 * </p>
 * 
 * @author Karthikeyan N
 *
 */
public class MySingletonImplUsingLazyInitialization {

	// static instance of class globally accessible 
	public static MySingletonImplUsingLazyInitialization singletonObject = null;
	
	private MySingletonImplUsingLazyInitialization() {
		/**
		 * private constructor so that class
		 * cannot be instantiated from outside
		 * this class   
		 */
	}
	
	public static MySingletonImplUsingLazyInitialization getInstance() {
		if(singletonObject == null) {
			singletonObject = new MySingletonImplUsingLazyInitialization();
		}
		
		return singletonObject;
	}
}
