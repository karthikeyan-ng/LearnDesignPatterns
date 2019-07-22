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
public class Direction {

	public void moveUp() {
		System.out.println("\t >>Direction Move Up button was pressed.");
	}
	
	public void moveDown() {
		System.out.println("\t >>Direction Move Down button was pressed.");
	}
	
	public void moveLeft() {
		System.out.println("\t >>Direction Move Left button was pressed.");
	}
	
	public void moveRight() {
		System.out.println("\t >>Direction Move Right button was pressed.");
	}
	
}
