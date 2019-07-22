/**
 * 
 */
package com.techstack.designpatterns.behavioral.state;

/**
 * @author Karthikeyan N
 *
 */
public class Delivered implements OrderState {

	private static Delivered instance = new Delivered();
	
	public static Delivered getInstance() {
		return instance;
	}
	
	@Override
	public void updateState(OrderContext context) {
		System.out.println("Your order is Delivered!");
	}

}
