/**
 * 
 */
package com.techstack.designpatterns.behavioral.chainofresponsibility.test;

import java.util.Arrays;
import java.util.List;

import com.techstack.designpatterns.behavioral.chainofresponsibility.AddFuel;
import com.techstack.designpatterns.behavioral.chainofresponsibility.ApplyPaint;
import com.techstack.designpatterns.behavioral.chainofresponsibility.AttachDashboard;
import com.techstack.designpatterns.behavioral.chainofresponsibility.AttachElectricalModule;
import com.techstack.designpatterns.behavioral.chainofresponsibility.AttachWheels;
import com.techstack.designpatterns.behavioral.chainofresponsibility.AttachWindowsAndDoors;
import com.techstack.designpatterns.behavioral.chainofresponsibility.InstallEngine;
import com.techstack.designpatterns.behavioral.chainofresponsibility.OutForDeliveryYard;
import com.techstack.designpatterns.behavioral.chainofresponsibility.PrepareHood;
import com.techstack.designpatterns.behavioral.chainofresponsibility.Stage;
import com.techstack.designpatterns.behavioral.chainofresponsibility.StaticRun;
import com.techstack.designpatterns.behavioral.chainofresponsibility.TrackRun;
import com.techstack.designpatterns.behavioral.chainofresponsibility.VerifyAllParts;
import com.techstack.designpatterns.behavioral.chainofresponsibility.vo.Car;

/**
 * @author Karthikeyan N
 *
 */
public class TestCarManufacturing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestCarManufacturing createACar = new TestCarManufacturing();
		createACar.make();

	}

	private List<Class<? extends Stage>> getStages() {
		return Arrays.asList(
				PrepareHood.class,
				InstallEngine.class,
				AttachDashboard.class,
				AttachElectricalModule.class,
				AttachWheels.class,
				AttachWindowsAndDoors.class,
				ApplyPaint.class,
				VerifyAllParts.class,
				AddFuel.class,
				StaticRun.class,
				TrackRun.class,
				OutForDeliveryYard.class
				);
	}
	
	private void make() {
		
		Car car = new Car();
		
		getStages().forEach(stage -> {
			try {
				stage.newInstance().prepare(car);
			} catch (InstantiationException | IllegalAccessException e) {
				System.err.println(String.format("Oops! something went wrong during %s ", stage.getName()));
				e.printStackTrace();
			}
		});
		
		System.out.println("===== Hey, your car has been build =====");
		System.out.println(car);
	}

}
