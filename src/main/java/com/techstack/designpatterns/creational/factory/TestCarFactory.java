/**
 * 
 */
package com.techstack.designpatterns.creational.factory;

/**
 * @author Karthikeyan N
 *
 */
public class TestCarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CarFactory.buildCar(CarType.SMALL);
		
		CarFactory.buildCar(CarType.SEDAN);
		
		CarFactory.buildCar(CarType.LUXURY);
		
	}

}
