package com.clone;

public class Cloning implements Cloneable {

	private String i;
	private String j;
	
	@Override
	public String toString() {
		return "Value of i and j is {"+i+"} , {"+j+"}";
	}
	
	public static void main(String[] args) {
		
		Cloning color = new Cloning();
		
		color.i = "red";
		color.j = "green";
		
		Cloning color2;
		try {
			
			color2 = (Cloning) color.clone();
			color2.i = "blue";
			
			System.out.println(color);
			System.out.println(color2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
