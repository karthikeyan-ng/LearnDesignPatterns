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
public class InTransit implements OrderState {
	
	private static InTransit instance = new InTransit();
	
	public static InTransit getInstance() {
		return instance;
	}

	@Override
	public void updateState(OrderContext context) {
		System.out.println("Your Order has been In Transit");
		context.setOrderState(OutForDelivery.getInstance());
	}

}
