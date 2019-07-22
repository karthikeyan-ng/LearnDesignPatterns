/**
 * 
 */
package com.techstack.designpatterns.creational.abstractfactory;

/**
 * @author Karthikeyan N
 *
 */
public class TestAbstractFactory {

	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.SMALL, LocationType.USA));
		
		
		System.out.println(CarFactory.buildCar(CarType.LUXURY, LocationType.ASIA));
	}
}
