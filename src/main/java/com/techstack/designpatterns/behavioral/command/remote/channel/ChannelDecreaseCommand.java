/**
 * 
 */
package com.techstack.designpatterns.behavioral.command.remote.channel;

import com.techstack.designpatterns.behavioral.command.receiver.Channel;
import com.techstack.designpatterns.behavioral.command.remote.Command;

import lombok.AllArgsConstructor;

/**
 * @author Karthikeyan N
 *
 */
@AllArgsConstructor
public class ChannelDecreaseCommand implements Command {

	private Channel channel;
	
	@Override
	public void execute() {
		System.out.println("Channel is decreasing...");
		channel.decrease();
	}

}
