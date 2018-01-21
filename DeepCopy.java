package com.clone;

public class DeepCopy {
	private String i;
	private String j;
	
	@Override
	public String toString() {
		return "Value of i and j is {"+i+"} , {"+j+"}";
	}
	
	public static void main(String[] args) {
		
		DeepCopy color = new DeepCopy();
		
		DeepCopy color2 = new DeepCopy();
		
		color.i = "red";
		color.j = "green";
		
		color2.i = "blue";
		
		System.out.println(color);
		System.out.println(color2);
	}

}
