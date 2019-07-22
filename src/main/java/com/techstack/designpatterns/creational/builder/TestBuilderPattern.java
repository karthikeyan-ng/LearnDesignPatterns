/**
 * 
 */
package com.techstack.designpatterns.creational.builder;

/**
 * @author Karthikeyan N
 *
 */
public class TestBuilderPattern {
	
	public static void main(String[] args) {
		
		Employee e = new Employee.EmployeeBuilder("Karthikeyan", "N")
								 .age(50)
								 .genderType(GenderType.MALE)
								 .raceType(RaceType.ASIAN)
								 .build();
		
		System.out.println(e);
	}

}
