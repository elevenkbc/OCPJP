package example.ch08._1;

import java.io.FileInputStream;
import java.io.InputStream;

public class TryCatchDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Opening a file ...");
			InputStream in = new FileInputStream("lostFile.txt");
			System.out.println("File is opened");
		}catch(Exception e) { //抓住所有的 Exception
			e.printStackTrace();
		}
	}
}
