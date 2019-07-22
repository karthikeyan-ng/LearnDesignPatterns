/**
 * 
 */
package com.techstack.designpatterns.behavioral.strategy;

/**
 * @author Karthikeyan N
 *
 */
public class CloudPushLoggerStrategy implements LoggerStrategy {

	@Override
	public void log(String content) {
		System.out.println(content);
	}

}
