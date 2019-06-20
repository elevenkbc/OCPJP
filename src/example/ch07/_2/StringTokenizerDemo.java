package example.ch07._2;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args){
		String shirts = "1st Shirt, 2nd Shirt, 3rd Shirt, 4th Shirt";
		StringTokenizer st = new StringTokenizer(shirts, ", "); //空格與, 都被當成拿來分割的標準
		//用類似 Iterator 來取出
		while(st.hasMoreElements()){
			System.out.println("'"+st.nextToken()+"'");
		}
		//注意， StringTokenizer 不支援 foreach loop (for(String s : st) {})
		//StringTokenizer is a legacy class that is retained forcompatibility reasons although its use is discouraged in new code.
		
		
		
	}
}
