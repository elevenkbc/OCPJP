package example.ch08._1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryCatchFinallyDemo {
	public static void main(String[] args) {
		InputStream in = null;
		try {
			System.out.println("Opening a file");
			in = new FileInputStream("src/lostFile.txt");
			System.out.println("File is opened");
			int data = in.read();
			in.close();
		}catch(FileNotFoundException e) {
			System.out.println("Catch FileNotFoundException");
			e.printStackTrace();
		}catch(IOException e) {//由 in.read() 丟出
			System.out.println("Catch IOException");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Catch Exception");
			e.printStackTrace();
		}finally {
			//用來在捕捉到例外的時候，關閉recourse
			try {
				if(in!=null) {
					in.close();
				}
			}catch(IOException e) {
				System.out.println("Failed to close file");
			}
		}
	}
}
