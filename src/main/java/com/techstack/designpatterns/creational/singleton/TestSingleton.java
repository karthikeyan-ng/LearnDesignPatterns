/**
 * 
 */
package com.techstack.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author Karthikeyan N
 *
 */
public class TestSingleton {

	public static void main(String[] args) {
		
		testSingletonUsingEarlyInitialization();
		testSingletonUsingLazyInitialization();
		testSingletonUsingMultipleThread();
		testSingletonUsingStaticBlock();
		testSingletonUsingBillPughSolution();
		testSingletonUsingSerialization();
	}
	
	private static void testSingletonUsingEarlyInitialization() {
		System.out.println("Early Initialization");
		
		MySingletonImplUsingEarlyInitialization singletonRef = MySingletonImplUsingEarlyInitialization.singletonObject;
		System.out.println(singletonRef);
		
		MySingletonImplUsingEarlyInitialization singletonRef1 = MySingletonImplUsingEarlyInitialization.singletonObject;
		System.out.println(singletonRef1);
		
		if(singletonRef.equals(singletonRef1)) {
			System.out.println("Both references are same");
		} else {
			System.out.println("Both references are NOT same");
		}
	}
	
	private static void testSingletonUsingLazyInitialization() {
		System.out.println("Lazy Initialization");
		
		MySingletonImplUsingLazyInitialization singletonRef = MySingletonImplUsingLazyInitialization.getInstance();
		System.out.println(singletonRef);
		
		MySingletonImplUsingLazyInitialization singletonRef1 = MySingletonImplUsingLazyInitialization.getInstance();
		System.out.println(singletonRef1);
		
		if(singletonRef.equals(singletonRef1)) {
			System.out.println("Both references are same");
		} else {
			System.out.println("Both references are NOT same");
		}
	}
	
	private static void testSingletonUsingMultipleThread() {
		System.out.println("Multiple Thread accessing");
		
		Runnable r1 = new Runnable() {
			public void run() {
				MySingletonImplUsingLazyInitialization singletonRef = MySingletonImplUsingLazyInitialization.getInstance();
				System.out.println(singletonRef);
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				MySingletonImplUsingLazyInitialization singletonRef = MySingletonImplUsingLazyInitialization.getInstance();
				System.out.println(singletonRef);
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
	
	private static void testSingletonUsingStaticBlock() {
		System.out.println("Singleton using Static block");
		
		MySingletonImplUsingStaticBlock singletonRef = MySingletonImplUsingStaticBlock.getInstance();
		System.out.println(singletonRef);
		
		MySingletonImplUsingStaticBlock singletonRef1 = MySingletonImplUsingStaticBlock.getInstance();
		System.out.println(singletonRef1);
		
		if(singletonRef.equals(singletonRef1)) {
			System.out.println("Both references are same");
		} else {
			System.out.println("Both references are NOT same");
		}
	}
	
	private static void testSingletonUsingBillPughSolution() {
		System.out.println("Singleton using BillPughSolution");
		
		MySingletonImplUsingBillPughSolution singletonRef = MySingletonImplUsingBillPughSolution.getInstance();
		System.out.println(singletonRef);
		
		MySingletonImplUsingBillPughSolution singletonRef1 = MySingletonImplUsingBillPughSolution.getInstance();
		System.out.println(singletonRef1);
		
		if(singletonRef.equals(singletonRef1)) {
			System.out.println("Both references are same");
		} else {
			System.out.println("Both references are NOT same");
		}
	}
	
	private static void testSingletonUsingSerialization() {
		System.out.println("Singleton using Serialization");
		
		MySingletonImplWhenAccessingSerialization instanceOne = MySingletonImplWhenAccessingSerialization.getInstance();
		
		try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
				ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"))) {
            
			// Serialize to a file
            out.writeObject(instanceOne);
 
            instanceOne.setValue(40);
 
            // Serialize to a file
            MySingletonImplWhenAccessingSerialization instanceTwo = (MySingletonImplWhenAccessingSerialization) in.readObject();
 
            System.out.println(instanceOne.getValue());
            System.out.println(instanceTwo.getValue());
 
            /**
			 * Unfortunately, both variables have different values of the variable "value".
			 * Clearly, there are two instances of our class. So, again we are in the same
			 * problem of multiple instances in our application.
			 * 
			 * To FIX this issue, we have to use {@link MySingletonImplWhenAccessingSerialization#readResolve}
			 */
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
}
