/**
 * 
 */
package com.techstack.designpatterns.creational.abstractfactory;

import com.techstack.designpatterns.creational.factory.CarType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Karthikeyan N
 *
 */
@ToString
@Getter @Setter
@AllArgsConstructor
public abstract class Car {

	private CarType carType;
	
	private LocationType locationType;
	
	protected abstract void build();
}
