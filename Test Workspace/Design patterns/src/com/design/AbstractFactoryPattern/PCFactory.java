package com.design.AbstractFactoryPattern;

public class PCFactory implements ComputerAbstarctFactory{
	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(ram, hdd, cpu);
	}

}
