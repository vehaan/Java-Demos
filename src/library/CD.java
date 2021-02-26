package library;

public class CD extends MediaItem {
	
	private String artist;
	private String genre;
	
	

	public CD() {
		super();
	}
	
	

	public CD(String artist, String genre) {
		super();
		this.artist = artist;
		this.genre = genre;
	}



	public String getArtist() {
		return artist;
	}



	public void setArtist(String artist) {
		this.artist = artist;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	@Override
	void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("This is the CD Check-In!");
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("This is the CD Check-Out!");
		
	}

	@Override
	void addItem() {
		// TODO Auto-generated method stub
		setCopies(getCopies()+1);
		System.out.println("The CD is added!");
		
	}



	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", getRuntime()=" + getRuntime() + ", getIdNumber()="
				+ getIdNumber() + ", getTitle()=" + getTitle() + ", getCopies()=" + getCopies() + "]";
	}
	
	

}
