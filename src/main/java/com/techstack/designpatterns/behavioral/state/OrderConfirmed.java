/**
 * 
 */
package com.techstack.designpatterns.behavioral.state;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author Karthikeyan N
 *
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderConfirmed implements OrderState {

	private static OrderConfirmed instance = new OrderConfirmed();
	
	public static OrderConfirmed getInstance() {
		return instance;
	}
	
	@Override
	public void updateState(OrderContext context) {
		System.out.println("Your Order has been confirmed.");
		context.setOrderState(Shipped.getInstance());
	}

}
