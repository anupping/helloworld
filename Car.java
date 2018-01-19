package com.tree;

public class Car implements Comparable<Car> {

	private String registrationNumber;
	private int price;

	public Car(String s) {
		this.registrationNumber = s;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.getRegistrationNumber();
	}

	@Override
	public int hashCode() {
		return this.registrationNumber.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && (obj instanceof Car)) {
			String regNum = ((Car) obj).getRegistrationNumber();
			if (regNum != null && regNum.equals(this.registrationNumber)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Car o) {

		if (this.getPrice() > o.getPrice())
			return 1;
		else if (this.getPrice() < o.getPrice())
			return -1;
		else
			return 0;
	}
}
