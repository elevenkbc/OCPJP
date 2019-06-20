package ch03.ex02;

public class Test {
	private int id;
	public Test(int id) {
		this.id = id;
	}
	public int hashCode() {
		return id + 42;
	}
	public boolean equals(Object obj) {
		return (this == obj) ? true : super.equals(obj);
	}
	
	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = new Test(10);
		Test t3 = new Test(20);
		System.out.print(t1.equals(t2) + " ");
		System.out.print(t1.equals(t3));
	}
}
