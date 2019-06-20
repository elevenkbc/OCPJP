package example.ch03._3;
class Employee{
	
}
class Manager extends Employee{
	
}
class Director extends Manager{
	
}
interface Quit{
	
}
public class CastTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		testCastClass(m);
		testCastInterface(m);
	}
	private static void testCastClass (Manager m) {
		Employee e = (Employee) m;	//向上轉型 
		Manager mg = (Manager) m;	//平行轉型
		Director d = (Director) m;	//向下轉型(編譯OK，run time NG!)
	}
	private static void testCastInterface(Manager m) {
		Quit q = (Quit) m; //interface 轉型(編譯時期，always OK!)
		//run time 就要看 m 物件，是否有 implements Quit interface.
	}
}
