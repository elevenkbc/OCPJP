package example.ch04._6;
class MyClass{
	public String myMethod() {
		return "MyClass myMethod";
	}
}
public class EnclosingClass {
	private int privatedField = 101;
	//Anonymous member classes (只能被建立一次)
	public MyClass o = new MyClass() {
		@Override 
		public String myMethod() {
			return "Anonymous class as field (object memeber)";
		}
	}; //; 注意
	
	//Member classes
	class MemberInner{
		public void run() {
			System.out.println("Member class: " + privatedField);
		}
	}
	
	//Static nested classes
	static class StaticNestedClass{
		public void run() {
			System.out.println("Static nested class");
		}
	}
	
	public void test1() {
		//Anonymous local classes
		MyClass o = new MyClass() {
			@Override
			public String myMethod() {
				return "Anonymous class as local variable";
			}
		};
		
		System.out.println(o);
		System.out.println(this.o);
	}
	
	public void test2() {
		//Local classes
		class LocalInner {
			public void run(String s) {
				System.out.println(s);
			}
		}
		new LocalInner().run("Local classes : " + privatedField);
	}
	
	public static void main(String[] args) {
		EnclosingClass outer = new EnclosingClass();
		outer.test1();
		outer.test2();
		
		//initialize inner classes
		MemberInner inner = outer.new MemberInner();
		inner.run();
		
		//initialize static inner classes
		StaticNestedClass staticNested = new EnclosingClass.StaticNestedClass();
		staticNested.run();
	}
}
