package com.design.AbstractFactoryPattern;


public class TestAbstractFactory {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new PCFactory("4 GB","16 GB","2.8 GHz"));
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}
}
