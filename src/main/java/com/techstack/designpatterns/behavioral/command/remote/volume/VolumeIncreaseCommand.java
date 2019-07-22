/**
 * 
 */
package com.techstack.designpatterns.behavioral.command.remote.volume;

import com.techstack.designpatterns.behavioral.command.receiver.Volume;
import com.techstack.designpatterns.behavioral.command.remote.Command;

import lombok.AllArgsConstructor;

/**
 * @author Karthikeyan N
 *
 */
@AllArgsConstructor
public class VolumeIncreaseCommand implements Command {

	private Volume volume;
	
	@Override
	public void execute() {
		System.out.println("Volume is increasing...");
		volume.increase();
	}

}
