/**
 * 
 */
package com.techstack.designpatterns.behavioral.chainofresponsibility;

import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.Car;

/**
 * @author Karthikeyan N
 *
 */
public interface Stage {

	void previousStage();
	
	void prepare(Car car);
	
	void nextStage();
}
