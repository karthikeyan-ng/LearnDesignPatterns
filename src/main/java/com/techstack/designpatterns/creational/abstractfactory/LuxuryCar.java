/**
 * 
 */
package com.techstack.designpatterns.creational.abstractfactory;

import com.techstack.designpatterns.creational.factory.CarType;

/**
 * @author Karthikeyan N
 *
 */
public class LuxuryCar extends Car {

	public LuxuryCar(LocationType locationType) {
		super(CarType.LUXURY, locationType);
		build();
	}

	@Override
	protected void build() {
		System.out.println("Building a Luxury Car...");
	}

}
