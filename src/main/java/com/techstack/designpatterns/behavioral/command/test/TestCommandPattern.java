/**
 * 
 */
package com.techstack.designpatterns.behavioral.command.test;

import com.techstack.designpatterns.behavioral.command.receiver.Channel;
import com.techstack.designpatterns.behavioral.command.receiver.Direction;
import com.techstack.designpatterns.behavioral.command.receiver.Volume;
import com.techstack.designpatterns.behavioral.command.remote.channel.ChannelDecreaseCommand;
import com.techstack.designpatterns.behavioral.command.remote.channel.ChannelIncreaseCommand;
import com.techstack.designpatterns.behavioral.command.remote.direction.DirectionMoveDownCommand;
import com.techstack.designpatterns.behavioral.command.remote.direction.DirectionMoveLeftCommand;
import com.techstack.designpatterns.behavioral.command.remote.direction.DirectionMoveRightCommand;
import com.techstack.designpatterns.behavioral.command.remote.direction.DirectionMoveUpCommand;
import com.techstack.designpatterns.behavioral.command.remote.volume.VolumeDecreaseCommand;
import com.techstack.designpatterns.behavioral.command.remote.volume.VolumeIncreaseCommand;

/**
 * @author Karthikeyan N
 *
 */
public class TestCommandPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TvRemoteControl remote = new TvRemoteControl();
		
		remote.sendCommand(new ChannelIncreaseCommand(new Channel())).execute();
		remote.sendCommand(new ChannelIncreaseCommand(new Channel())).execute();
		remote.sendCommand(new ChannelDecreaseCommand(new Channel())).execute();
		
		System.out.println("===================================");
		
		remote.sendCommand(new VolumeIncreaseCommand(new Volume())).execute();
		remote.sendCommand(new VolumeIncreaseCommand(new Volume())).execute();
		remote.sendCommand(new VolumeDecreaseCommand(new Volume())).execute();
		
		System.out.println("===================================");
		
		remote.sendCommand(new DirectionMoveUpCommand(new Direction())).execute();
		remote.sendCommand(new DirectionMoveDownCommand(new Direction())).execute();
		remote.sendCommand(new DirectionMoveLeftCommand(new Direction())).execute();
		remote.sendCommand(new DirectionMoveRightCommand(new Direction())).execute();
		
		System.out.println("===================================");
		
		
	}

}
