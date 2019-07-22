/**
 * 
 */
package com.techstack.designpatterns.creational.abstractfactory;

import com.techstack.designpatterns.creational.factory.CarType;

/**
 * @author Karthikeyan N
 *
 */
public class SedanCar extends Car {

	public SedanCar(LocationType locationType) {
		super(CarType.SEDAN, locationType);
		build();
	}

	@Override
	protected void build() {
		System.out.println("Building a Sedan Car...");
	}

}
