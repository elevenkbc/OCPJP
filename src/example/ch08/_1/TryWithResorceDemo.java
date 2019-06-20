package example.ch08._1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResorceDemo {
	public static void main(String[] args) {
		System.out.println("Opening a file");
		try(InputStream in = new FileInputStream("./lostFile.txt")){
			System.out.println("File is Opened");
			int data = in.read();
			in.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) { // 由 in.read(); 拋出
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
