package innernested;

public class PrintableDemoTraditional implements Printable{



	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is the Traditional Implementation!");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintableDemoTraditional obj = new PrintableDemoTraditional();
		obj.print();

	}

}
