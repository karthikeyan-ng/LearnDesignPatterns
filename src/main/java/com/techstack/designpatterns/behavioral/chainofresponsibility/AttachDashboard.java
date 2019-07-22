/**
 * 
 */
package com.techstack.designpatterns.behavioral.chainofresponsibility;

import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.Car;

/**
 * @author Karthikeyan N
 *
 */
public class AttachDashboard implements Stage {

	@Override
	public void previousStage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void prepare(Car car) {
		System.out.println("Attaching Dashboard");
		
	}
	
	@Override
	public void nextStage() {
		// TODO Auto-generated method stub

	}

}
