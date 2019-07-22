/**
 * 
 */
package com.techstack.designpatterns.behavioral.command.remote.direction;

import com.techstack.designpatterns.behavioral.command.receiver.Direction;
import com.techstack.designpatterns.behavioral.command.remote.Command;

import lombok.AllArgsConstructor;

/**
 * @author Karthikeyan N
 *
 */
@AllArgsConstructor
public class DirectionMoveUpCommand implements Command {

	private Direction navigation;
	
	@Override
	public void execute() {
		System.out.println("Navigation Move Up command");
		navigation.moveUp();
	}

}
