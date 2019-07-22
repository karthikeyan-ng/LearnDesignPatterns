/**
 * 
 */
package com.techstack.designpatterns.creational.abstractfactory;

import com.techstack.designpatterns.creational.factory.CarType;

/**
 * @author Karthikeyan N
 *
 */
public class SmallCar extends Car {

	public SmallCar(LocationType locationType) {
		super(CarType.SMALL, locationType);
		build();
	}

	@Override
	protected void build() {
		System.out.println("Building a Smaill Car...");
	}

}
