/**
 * 
 */
package com.techstack.designpatterns.creational.factory;

/**
 * @author Karthikeyan N
 *
 */
public class CarFactory {

	public static Car buildCar(CarType carType) {
		
		Car car = null;
		switch(carType) {
		case LUXURY:
			car = new LuxuryCar();
			break;
		case SEDAN:
			car = new SedanCar();
			break;
		case SMALL:
			car = new SmallCar();
			break;
		default:
			throw new IllegalArgumentException("Factory doesn't have facility to build unknown type");
		}
		
		return car;
	}
}
