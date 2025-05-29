package com.design.singleton;

import java.lang.reflect.Constructor;

/*Breaking the singleton pattern using Reflection*/
public class ReflectionSingleton {
	
public static void main(String[] args) {
	EagerInitiallization instanceOne = EagerInitiallization.getInstance();
	EagerInitiallization instanceTwo = null;
	EnumSingleton instEnumOne = EnumSingleton.INSTANCE;
	EnumSingleton instEnumTwo = EnumSingleton.INSTANCE;
	
	try {
		Constructor[] constructor = EagerInitiallization.class.getDeclaredConstructors();
		for(Constructor constructors : constructor) {
			
			constructors.setAccessible(true);
			instanceTwo = (EagerInitiallization) constructors.newInstance();
            break;
		}
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	System.out.println(instanceOne.hashCode());
	System.out.println(instanceTwo.hashCode());
	System.out.println(instEnumOne.hashCode());
	System.out.println(instEnumTwo.hashCode());
}

}
