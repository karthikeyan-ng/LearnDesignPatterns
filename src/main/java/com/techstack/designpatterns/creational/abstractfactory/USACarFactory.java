/**
 * 
 */
package com.techstack.designpatterns.creational.abstractfactory;

/**
 * @author Karthikeyan N
 *
 */
public class USACarFactory {

	public static Car buildCar(CarType carType) {
		Car car = null;
		switch(carType) {
		case LUXURY:
			car = new SmallCar(LocationType.USA);
			break;
		case SEDAN:
			car = new SedanCar(LocationType.USA);
			break;
		case SMALL:
			car = new LuxuryCar(LocationType.USA);
			break;
		default:
			throw new IllegalArgumentException("Factory doesn't have facility to build unknown type");
		}
		
		return car;
	}
}
