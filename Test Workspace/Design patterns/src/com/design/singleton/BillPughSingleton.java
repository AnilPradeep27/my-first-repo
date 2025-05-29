package com.design.singleton;

public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class StaticSingleton{
		private static final BillPughSingleton INSTANCE= new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return StaticSingleton.INSTANCE;
	}

}
