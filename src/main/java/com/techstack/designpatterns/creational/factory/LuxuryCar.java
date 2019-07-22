/**
 * 
 */
package com.techstack.designpatterns.creational.factory;

/**
 * @author Karthikeyan N
 *
 */
public class LuxuryCar extends Car {

	public LuxuryCar() {
		super(CarType.LUXURY);
		build();
	}

	@Override
	protected void build() {
		System.out.println("Building a Luxury Car...");
	}

}
