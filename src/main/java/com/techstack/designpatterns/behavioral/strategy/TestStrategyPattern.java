/**
 * 
 */
package com.techstack.designpatterns.behavioral.strategy;

/**
 * @author Karthikeyan N
 *
 */
public class TestStrategyPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LoggerContext context = new LoggerContext();
		
		context.setLoggerStrategy(new ConsoleLoggerStrategy());
		context.log("My Log Message goes to Console");
		
		context.setLoggerStrategy(new FileLoggerStrategy());
		context.log("My Log Message goes to File content");
		
		context.setLoggerStrategy(new CloudPushLoggerStrategy());
		context.log("My Log Message goes to Cloud");
		
	}

}
