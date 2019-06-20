package ch06.ex13;

import java.util.*;

class Car {
	int id;
	String brand;

	public Car(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}

	public String toString() {
		return id + ":" + brand;
	}

}

public class Test {
	public static void main(String[] args) {
		Set<Car> cars = new TreeSet<>();
		cars.add(new Car(23, "Ford"));
		cars.add(new Car(24, "BMW"));
		System.out.println(cars);
	}
}
