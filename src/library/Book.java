package library;

public class Book extends WrittenItem {
	
	
	
	@Override
	void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("This is the book Check-In!");
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("This is the book Check-Out!");
	}

	@Override
	void addItem() {
		// TODO Auto-generated method stub
		setCopies(getCopies()+1);
		System.out.println("The book item is added!");
		
	}

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", getIdNumber()=" + getIdNumber() + ", getTitle()=" + getTitle()
				+ ", getCopies()=" + getCopies() + "]";
	}
	
	
	

}
