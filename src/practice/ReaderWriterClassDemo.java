package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader r = new FileReader("d:\\mkg\\data.txt"); FileWriter wr = new FileWriter(new File("d:\\mkg\\copy.txt"))){
			int val;
			while((val = r.read()) != -1) {
				System.out.print((char)val);
				wr.write(val);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
