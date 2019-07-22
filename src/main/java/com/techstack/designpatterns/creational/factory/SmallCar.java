/**
 * 
 */
package com.techstack.designpatterns.creational.factory;

/**
 * @author Karthikeyan N
 *
 */
public class SmallCar extends Car {

	public SmallCar() {
		super(CarType.SMALL);
		build();
	}

	@Override
	protected void build() {
		System.out.println("Building a Smaill Car...");
	}

}
