/**
 * 
 */
package com.techstack.designpatterns.behavioral.chainofresponsibility;

import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.BodyFrame;
import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.Car;

/**
 * @author Karthikeyan N
 *
 */
public class PrepareHood implements Stage {

	@Override
	public void previousStage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void prepare(Car car) {
		System.out.println("Preparing Car hood");
		BodyFrame bodyFrame = new BodyFrame(500, 230);
		car.setBodyFrame(bodyFrame);
	}
	
	@Override
	public void nextStage() {
		// TODO Auto-generated method stub

	}
}
