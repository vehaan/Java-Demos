package library;

public class JournalPaper extends WrittenItem  {
	
	private int yearPublished;
	
	

	public JournalPaper() {
		super();
	}

	public JournalPaper(int yearPublished) {
		super();
		this.yearPublished = yearPublished;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("This is the journal paper Check-In!");
		
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("This is the journal paper Check-Out!");
		
	}

	@Override
	void addItem() {
		// TODO Auto-generated method stub
		setCopies(getCopies()+1);
		System.out.println("The journal paper is added!");
		
	}

	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", getAuthor()=" + getAuthor() + ", getIdNumber()="
				+ getIdNumber() + ", getTitle()=" + getTitle() + ", getCopies()=" + getCopies() + "]";
	}
	
	
	
}
