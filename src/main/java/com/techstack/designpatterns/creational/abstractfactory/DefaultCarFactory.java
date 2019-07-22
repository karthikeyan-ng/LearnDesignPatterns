/**
 * 
 */
package com.techstack.designpatterns.creational.abstractfactory;

/**
 * @author Karthikeyan N
 *
 */
public class DefaultCarFactory {

	public static Car buildCar(CarType carType) {
		Car car = null;
		switch(carType) {
		case LUXURY:
			car = new SmallCar(LocationType.DEFAULT);
			break;
		case SEDAN:
			car = new SedanCar(LocationType.DEFAULT);
			break;
		case SMALL:
			car = new LuxuryCar(LocationType.DEFAULT);
			break;
		default:
			throw new IllegalArgumentException("Factory doesn't have facility to build unknown type");
		}
		
		return car;
	}
}
