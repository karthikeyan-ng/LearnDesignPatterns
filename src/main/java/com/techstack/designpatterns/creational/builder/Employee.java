/**
 * 
 */
package com.techstack.designpatterns.creational.builder;

import lombok.Getter;
import lombok.ToString;

/**
 * 
 * @author Karthikeyan N
 *
 */
@ToString
public class Employee {
	
	private String firstname;
	private String lastname;
	private int age;
	private GenderType genderType;
	private RaceType raceType;
	
	private Employee(EmployeeBuilder builder) {
		this.firstname = builder.getFirstname();
		this.lastname = builder.getLastname();
		this.age = builder.getAge();
		this.genderType = builder.getGenderType();
		this.raceType = builder.getRaceType();
	}
	
	@Getter
	public static class EmployeeBuilder {
		
		private final String firstname;
		private final String lastname;
		private int age;
		private GenderType genderType;
		private RaceType raceType;
		
		public EmployeeBuilder(String firstname, String lastname) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
		}

		public EmployeeBuilder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder genderType(GenderType genderType) {
			this.genderType = genderType;
			return this;
		}

		public EmployeeBuilder raceType(RaceType raceType) {
			this.raceType = raceType;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
	}

}
