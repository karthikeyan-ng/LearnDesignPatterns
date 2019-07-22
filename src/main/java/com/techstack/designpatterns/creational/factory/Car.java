/**
 * 
 */
package com.techstack.designpatterns.creational.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Karthikeyan N
 *
 */
@Getter @Setter
@AllArgsConstructor
public abstract class Car {

	private CarType carType;
	
	protected abstract void build();
}
