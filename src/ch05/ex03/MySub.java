package ch05.ex03;

interface MyInterface {
	String type = "MyInterface";

	public void details();
}

class MySuper {
	static String type = "MySuper";
}

public class MySub extends MySuper implements MyInterface {
	public void details() {
		System.out.print(type);// java complier 混淆，不知道你指的type 是 MyInterface 的 還是 MySuper 的
		// 用 MyInterface.type 與 super.type (MySuper.type)來區別
	}

	public static void main(String[] args) {
		new MySub().details();
	}
}
