/**
 * 
 */
package com.techstack.designpatterns.creational.abstractfactory;

/**
 * @author Karthikeyan N
 *
 */
public class CarFactory {

	public static Car buildCar(CarType carType, LocationType locationType) {
		
		Car car = null;
		switch(locationType) {
		case ASIA:
			car = AsiaCarFactory.buildCar(carType);
			break;
		case DEFAULT:
			car = DefaultCarFactory.buildCar(carType);
			break;
		case USA:
			car = USACarFactory.buildCar(carType);
			break;
		default:
			throw new IllegalArgumentException("Factory doesn't have facility to build unknown type");
		}
		return car;
	}
}
