/**
 * 
 */
package com.techstack.designpatterns.behavioral.strategy;

import lombok.Setter;

/**
 * @author Karthikeyan N
 *
 */
@Setter
public class LoggerContext {
	
	LoggerStrategy loggerStrategy;
	
	public void log(String content) {
		loggerStrategy.log(content);
	}

}
