package thread;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
	List<Integer> data;
	
	public Data(List<Integer> data) {
		super();
		this.data = data;
	}
	
	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

	public Data() {
		data = new ArrayList<>();
	}
	
}
