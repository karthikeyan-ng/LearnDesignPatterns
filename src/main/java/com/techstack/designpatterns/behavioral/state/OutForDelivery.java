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
public class OutForDelivery implements OrderState {

	private static OutForDelivery instance = new OutForDelivery();
	
	public static OutForDelivery getInstance() {
		return instance;
	}
	
	@Override
	public void updateState(OrderContext context) {
		System.out.println("Your Order has been Out for Delivery");
		context.setOrderState(Delivered.getInstance());
	}

}
