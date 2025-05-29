package com.design.singleton;

public class LazyInitialization {
private static LazyInitialization instance;
	
	private LazyInitialization(){
		
	}
	
	public static LazyInitialization getInstance() {
		if(instance == null) {
			return instance = new LazyInitialization();
		}
		
		return instance;
			
	}
}
