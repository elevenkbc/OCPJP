package example.ch07._2;

public class StringTest {
	public static void main(String[] args) {
		//格式化輸出字串
		System.out.printf("'%s'%n", "Jim");
		System.out.printf("'%S'%n", "Jim");
		System.out.printf("'%4s'%n", "Jim");//以長度為4的字元寬度來呈現，靠右
		System.out.printf("'%4s'%n", "JimJim"); //要顯示的字串，比限制顯示的長度還長
		System.out.printf("'%-4s'%n", "Jim");//以長度為4的字元寬度來呈現，靠左
		System.out.printf("'%4S'%n", "Jim");
		System.out.printf("'%4.2s'%n", "Jim"); //長度為4個字元，只用其中兩個字原來顯示
		System.out.printf("'%4.5s'%n", "JimJim"); //長度為4個字元，用5個字元來顯示，故只有前4個字元有用到
		System.out.printf("'%s %s %s'%n", "j", "i", "m");
		System.out.printf("'%3$s %2$s %1$s'%n", "j", "i", "m");
		System.out.printf("'%s'%n", null);
		System.out.printf("'%s'%n", new java.util.ArrayList<>());
		
		//格式化輸出邏輯結果
		System.out.printf("'%B'%n", true);
		System.out.printf("'%b'%n", true);
		System.out.printf("'%6b'%n", true);
		System.out.printf("'%6.2b'%n", true);
		System.out.printf("'%-6.2b'%n", true);
		System.out.printf("'%b'%n", 2019);
		System.out.printf("'%b'%n", new java.util.ArrayList<>());
		System.out.printf("'%b'%n", null);
	}
}
