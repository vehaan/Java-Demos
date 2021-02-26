package library;

public class Exercise3Main {

	public static void main(String[] args) {
		Book HarryPotter = new Book();
		HarryPotter.setTitle("Harry Potter and the philosopher's stone");
		HarryPotter.setCopies(194);
		HarryPotter.setIdNumber(1);
		HarryPotter.setAuthor("J K Rowling");
		System.out.println(HarryPotter);
		HarryPotter.checkIn();
		HarryPotter.addItem();
		HarryPotter.checkOut();
		System.out.println(HarryPotter);
		

	}

}
