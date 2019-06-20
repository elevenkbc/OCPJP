package ch03.ex04;

class Student {
	String name = "Unknown";

	public String getName() {
		return name;
	}
}

class Jim extends Student {
	String name = "Jim";
}

class Harry extends Student {
	String name = "Harry";

	public String getName() {
		return name; // field shadowing
	}
}

public class Test {
	public static void main(String[] args) {
		Student s1 = new Jim();
		Student s2 = new Harry();
		System.out.print(s1.getName() + " ");
		System.out.print(s2.getName());
	}
}
