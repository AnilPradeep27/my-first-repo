package com.design.singleton;

/*In eager initialization, the instance of the singleton class is created at the time of class loading 
 * The drawback to eager initialization is that the method is created 
 * even though the client application might not be using it.
 * 
 * */
public class EagerInitiallization {
	private static EagerInitiallization instance = new EagerInitiallization();
	
	private EagerInitiallization(){
		
	}
	
	public static EagerInitiallization getInstance() {
			return  instance;
			
	}

}
