/**
 * 
 */
package com.techstack.designpatterns.creational.abstractfactory;

/**
 * @author Karthikeyan N
 *
 */
public class AsiaCarFactory {

	public static Car buildCar(CarType carType) {
		Car car = null;
		switch(carType) {
		case LUXURY:
			car = new SmallCar(LocationType.ASIA);
			break;
		case SEDAN:
			car = new SedanCar(LocationType.ASIA);
			break;
		case SMALL:
			car = new LuxuryCar(LocationType.ASIA);
			break;
		default:
			throw new IllegalArgumentException("Factory doesn't have facility to build unknown type");
		}
		
		return car;
	}
}
