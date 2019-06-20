package ch03.ex01;

class A {
	int a = 5;

	String doA1() {
		return "a1";
	}

	static String doA2() {
		return "a2";
	}
}

class B extends A {
	int a = 7;

	String doA1() {
		return "b1";
	}

	static String doA2() {
		return "b2";
	}

	void go() {
		A a = new B();
		System.out.print(a.doA1() + "\n" + a.doA2() + "\n" + a.a);
	}
}

public class Test {
	public static void main(String[] args) {
		new B().go(); //注意 field 沒有override， 只有 field shadowing
	}
}
