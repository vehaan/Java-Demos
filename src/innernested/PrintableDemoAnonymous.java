package innernested;

public class PrintableDemoAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable obj1 = new Printable() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("This is the Anonymous Implementation!");
				
			}
		};
		
		obj1.print();
		
		Printable obj2 = () -> { System.out.println("The is the lambda Implementation!");};
		obj2.print();

	}

}
