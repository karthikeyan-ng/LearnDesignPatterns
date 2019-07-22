package com.techstack.designpatterns.behavioral.chainofresponsibility;

/**
 * What is the Pipeline Design Pattern?
 * 
 * The Pipeline Design Pattern is breaking down complicated process into
 * individual tasks (operations, or stages). Each task is completing a step of
 * calculation, then it passes to the next task(stage) till the last stage.
 * 
 * Let's take an example to understand the concept : Let's imagine that we have
 * an assembly line of a car, let's assume it should go through various "N" stages (stations) to
 * finish manufacturing a car :
 * 
 * Example:
 * 		- Prepare Hood 
 * 		- Install Engine
 * 		- Attach Dashboard
 * 		- Attach Electrical Module
 * 		- Attach Wheels
 * 		- Attach Windows And Doors
 * 		- Apply Paint
 * 		- Verify All Parts
 * 		- Add Fuel
 * 		- Static Run
 * 		- Track Run
 * 		- Out For Delivery Yard
 * 
 * Now the car has been manufactured after going through all those stages!.
 * 
 * "Without that assembly line, we had to do all those stages at one stage which is very complex to 
 * be handled, that’s why Pipeline design pattern is there!"
 * 
 * 
 */
