/**
 * 
 */
package com.techstack.designpatterns.behavioral.chainofresponsibility.vo;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author Karthikeyan N
 *
 */
@ToString
@AllArgsConstructor
public class Engine {

	private EngineType type;
	
	private EnginePower power;
	
	private Gearshift gearshift;
	
	private FuelType fuelType;
}
