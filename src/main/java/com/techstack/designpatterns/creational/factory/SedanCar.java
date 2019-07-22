/**
 * 
 */
package com.techstack.designpatterns.creational.factory;

/**
 * @author Karthikeyan N
 *
 */
public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.SEDAN);
		build();
	}

	@Override
	protected void build() {
		System.out.println("Building a Sedan Car...");
	}

}
