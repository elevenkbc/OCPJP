package ch03.ex03;

class Plant {
	abstract String grow();
}

class Vegetable extends Plant {
	String grow() {
		return "Up";
	}
}

class Carrot extends Vegetable {
	String grow() {
		return "down";
	}
}

public class Test {
	public static void main(String[] args) {
		Vegetable e = new Vegetable();
		Vegetable c = new Carrot();

		System.out.print(e.grow() + c.grow());
	}
}
