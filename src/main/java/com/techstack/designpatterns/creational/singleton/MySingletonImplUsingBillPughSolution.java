/**
 * 
 */
package com.techstack.designpatterns.creational.singleton;

/**
 * <p>
 * Bill Pugh was main force behind the java memory model changes. His principle
 * "Initialization-on-demand holder idiom" also uses the static block idea, but
 * in a different way. It suggest to use static inner class.
 * </p>
 * 
 * <p>
 * As you can see, until we need an instance, the LazyHolder class will not be
 * initialized until required and you can still use other static members of
 * BillPughSingleton class. This is the solution, i will recommend to use
 * </p>
 * 
 * @author Karthikeyan N
 *
 */
public class MySingletonImplUsingBillPughSolution {

	private MySingletonImplUsingBillPughSolution() {
		/**
		 * private constructor so that class cannot be instantiated from outside this
		 * class
		 */
	}

	private static class LazySingleton {
		private static final MySingletonImplUsingBillPughSolution INSTANCE = new MySingletonImplUsingBillPughSolution();
	}

	public static MySingletonImplUsingBillPughSolution getInstance() {
		return LazySingleton.INSTANCE;
	}
}
