package org.sample.inherit;

public class Singleton {
	private static Singleton sin = null;               // lazy load

	private Singleton() {}

	public static Singleton getInstance() {
		//return sin;
		if(null == sin) {
			sin = new Singleton();
		}
		return sin;
	}
}