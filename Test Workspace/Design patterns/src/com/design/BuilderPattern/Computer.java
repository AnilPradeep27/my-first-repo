package com.design.BuilderPattern;

public class Computer {

	//Required Parameters
	private String RAM;
	private String HDD;

	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public Computer(ComputerBuilder computerBuilder) {
		this.HDD=computerBuilder.HDD;
		this.RAM=computerBuilder.RAM;
		this.isGraphicsCardEnabled=computerBuilder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=computerBuilder.isBluetoothEnabled;
	}

	public String getRAM() {
		return RAM;
	}

	public String getHDD() {
		return HDD;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Computer [RAM=" + RAM + ", HDD=" + HDD + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
	public static class ComputerBuilder{

		private boolean isBluetoothEnabled;
		private boolean isGraphicsCardEnabled;
		private String RAM;
		private String HDD;
		
		public ComputerBuilder(String hdd, String ram){
			this.HDD=hdd;
			this.RAM=ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}

		
	}

}
