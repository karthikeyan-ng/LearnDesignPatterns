/**
 * 
 */
package com.techstack.designpatterns.behavioral.command.test;

import com.techstack.designpatterns.behavioral.command.remote.Command;

/**
 * @author Karthikeyan N
 *
 */
public class TvRemoteControl {
	
	private Command command;
	
	public Command sendCommand(Command command) {
		this.command = command;
		return this.command;
	}
	
	public void execute() {
		this.command.execute();
	}

}
