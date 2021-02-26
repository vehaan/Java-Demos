package practice;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try with resources, the resource which we are creating they are auto closed
		//any class resource which implements AutoClosable interface
		//Can include multiple resources separated by ;
		try(FileInputStream fis = new FileInputStream("d:\\mkg\\data.txt")){
			int val;
			while ((val = fis.read()) != -1) {
				System.out.print((char)val);
			}
		}catch (IOException | ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
