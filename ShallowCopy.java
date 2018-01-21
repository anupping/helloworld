package com.clone;

public class ShallowCopy {

	private String i;
	private String j;
	
	@Override
	public String toString() {
		return "Value of i and j is {"+i+"} , {"+j+"}";
	}
	
	public static void main(String[] args) {
		
		ShallowCopy color = new ShallowCopy();
		
		ShallowCopy color2 = color;
		
		color.i = "red";
		color.j = "green";
		
		color2.i = "blue";
		
		System.out.println(color);
		System.out.println(color2);
	}
}
