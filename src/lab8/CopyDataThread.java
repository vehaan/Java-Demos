package lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread{
	
	private String data;
	
	
	
	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	void read(){
		try(BufferedReader br = new BufferedReader(new FileReader("d:\\mkg\\data.txt")); BufferedWriter bw = new BufferedWriter(new FileWriter(new File("d:\\mkg\\copy.txt")))){
			String val;
			while((val = br.readLine()) != null) {
				System.out.print(val);
				bw.write(val);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	@Override
	public void run() {
		
	}
}
