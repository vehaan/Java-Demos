package library;

public class Video extends MediaItem{
	
	private String director;
	private String genre;
	private int yearReleased;
	
	
	

	public Video() {
		super();
	}
	
	

	public Video(String director, String genre, int yearReleased) {
		super();
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public int getYearReleased() {
		return yearReleased;
	}



	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	@Override
	void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("This is the Video Check-In!");
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("This is the Video Check-Out!");
		
	}

	@Override
	void addItem() {
		// TODO Auto-generated method stub
		setCopies(getCopies()+1);
		System.out.println("The video item is added!");
		
	}



	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + ", getRuntime()="
				+ getRuntime() + ", getIdNumber()=" + getIdNumber() + ", getTitle()=" + getTitle() + ", getCopies()="
				+ getCopies() + "]";
	}
	

}
