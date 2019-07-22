/**
 * 
 */
package com.techstack.designpatterns.behavioral.chainofresponsibility;

import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.Car;
import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.Engine;
import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.EnginePower;
import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.EngineType;
import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.FuelType;
import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.Gearshift;

/**
 * @author Karthikeyan N
 *
 */
public class InstallEngine implements Stage {

	@Override
	public void previousStage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void prepare(Car car) {
		System.out.println("Installing Car Engine");
		Engine engine = new Engine(EngineType.BOXER, new EnginePower(100), Gearshift.AUTOMATIC, FuelType.ELECTRIC);
		car.setEngine(engine);
	}
	
	@Override
	public void nextStage() {
		// TODO Auto-generated method stub

	}

}
