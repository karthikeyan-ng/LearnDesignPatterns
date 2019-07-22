/**
 * 
 */
package com.techstack.designpatterns.behavioral.state;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Karthikeyan N
 *
 */
@Getter @Setter
public class OrderContext {
	
	private OrderState orderState;
	private Long orderId;
	
	public OrderContext(OrderState orderState, Long orderId) {
		super();
		this.orderState = orderState;
		this.orderId = orderId;
		
		if(Objects.isNull(orderState)) {
			this.orderState = OrderConfirmed.getInstance();
		}
	}

	public void update() {
		orderState.updateState(this);
    }

}
