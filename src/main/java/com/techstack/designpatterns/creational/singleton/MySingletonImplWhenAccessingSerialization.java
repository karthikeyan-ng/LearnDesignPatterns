/**
 * 
 */
package com.techstack.designpatterns.creational.singleton;

import java.io.Serializable;

/**
 * A singleton class should have public visibility so that complete application
 * can use
 * 
 * <p>
 * your application is distributed and it frequently serializes objects into the
 * file system, only to read them later when required. Please note that
 * de-serialization always creates a new instance.
 * </p>
 * 
 * @author Karthikeyan N
 *
 */
public class MySingletonImplWhenAccessingSerialization implements Serializable {

	private static final long serialVersionUID = -5522456556265073338L;

	private static MySingletonImplWhenAccessingSerialization singletonObject = null;

	private MySingletonImplWhenAccessingSerialization() {
	}

	public static MySingletonImplWhenAccessingSerialization getInstance() {
		if (singletonObject == null) {
			singletonObject = new MySingletonImplWhenAccessingSerialization();
		}
		return singletonObject;
	}

	protected Object readResolve() {
        return singletonObject;
    }
	
	private int value = 20;

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
