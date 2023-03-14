package com.george.limitsservice.bean;

public class LimitConfiguration {
	 
	private int minvalue;
	private int maxvalue;
	public int getminvalue() {
		return minvalue;
	}
	public void setminvalue(int minvalue) {
		this.minvalue = minvalue;
	}
	public int getmaxvalue() {
		return maxvalue;
	}
	public void setmaxvalue(int maxvalue) {
		this.maxvalue = maxvalue;
	}
	public LimitConfiguration(int minvalue, int maxvalue) {
		super();
		this.minvalue = minvalue;
		this.maxvalue = maxvalue;
	}
	public LimitConfiguration() {
		
	}
	
	

}
