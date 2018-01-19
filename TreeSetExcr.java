package com.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExcr {
	public static void main(String[] args) {

		TreeSet<Car> treeSet = new TreeSet<Car>();

		for (int i = 0; i < 100; i++) {

			Car car = new Car("H-" + i);
			car.setPrice((int) (Math.random() * 100 + 1));

			treeSet.add(car);

		}
		
		Car c3 = new Car("H-499");
		c3.setPrice(50);
		treeSet.add(c3);

		Iterator<Car> it = treeSet.iterator();
		while (it.hasNext()) {
			Car car = it.next();
			System.out.println(car + "- Price:- " + car.getPrice());
		}
		System.out.println();System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");System.out.println();
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		System.out.println();System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");System.out.println();
		Iterator<Car> headSetIt = treeSet.headSet(c3).iterator();
		while (headSetIt.hasNext()) {
			Car car = headSetIt.next();
			System.out.println(car + "- Price:- " + car.getPrice());
		}
		

		System.out.println();System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");System.out.println();
		Iterator<Car> tailSetIt = treeSet.tailSet(c3).iterator();
		while (tailSetIt.hasNext()) {
			Car car = tailSetIt.next();
			System.out.println(car + "- Price:- " + car.getPrice());
		}
		
		TreeSet cars = new TreeSet<Car>(new CustomComparator());
		
		cars.addAll(treeSet);
		System.out.println();System.out.println("~~~~~~~~~~~CustomComparator~~~~~~~~~~~~");System.out.println();
		Iterator<Car> carsIt = cars.iterator();

		while (carsIt.hasNext()) {
			Car car = carsIt.next();
			System.out.println(car + "- Price:- " + car.getPrice());
		}
		

	}
}
