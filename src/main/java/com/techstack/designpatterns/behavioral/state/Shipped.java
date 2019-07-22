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
public class Shipped implements OrderState {

	private static Shipped instance = new Shipped();
	
	public static Shipped getInstance() {
		return instance;
	}
	
	@Override
	public void updateState(OrderContext context) {
		System.out.println("Your Order has been shipped");
		context.setOrderState(InTransit.getInstance());
	}

}
