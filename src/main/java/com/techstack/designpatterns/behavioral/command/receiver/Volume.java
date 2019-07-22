/**
 * 
 */
package com.techstack.designpatterns.behavioral.command.receiver;

import lombok.ToString;

/**
 * @author Karthikeyan N
 *
 */
@ToString
public class Volume {

	private static int number = 0;
	
	public void increase() {
		number+=1;
		System.out.println("Volume Number is Increased " + number);
	}
	
	public void decrease() {
		number-=1;
		System.out.println("Volume Number is Decreased " + number);
	}
}
