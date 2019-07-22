/**
 * 
 */
package com.techstack.designpatterns.behavioral.state;

/**
 * @author Karthikeyan N
 *
 */
public class TestStatePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OrderContext context = new OrderContext(null, 123445L);

		context.update();
		context.update();
		context.update();
		context.update();
		context.update();
		context.update();
	}

}
