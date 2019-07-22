/**
 * 
 */
package com.techstack.designpatterns.behavioral.chainofresponsibility.vo;

import lombok.Setter;
import lombok.ToString;

/**
 * @author Karthikeyan N
 *
 */
@ToString
@Setter
public class Car {

	private BodyFrame bodyFrame;
	
	private Engine engine;
}
