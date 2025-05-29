package com.design.singleton;

public class DoubleCheckingLocking {
	private static DoubleCheckingLocking instance;
	private DoubleCheckingLocking() {

	}
	public static  DoubleCheckingLocking getInstance() {
		if(instance == null) {
			synchronized(DoubleCheckingLocking.class) {
				if(instance == null) {
					instance = new DoubleCheckingLocking();
				}
			}
		}

		return instance;

	}

}
