package com.springmvc.bean;

public class Hello {

	int i =10;
	
	public void getNumber() {
		i=i+1;
		System.out.println("current no : "+i);
	}
	
	public Hello() {
		System.out.println(getClass().getSimpleName() + " created.");
	}

}
