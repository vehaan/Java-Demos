package library;

public abstract class WrittenItem extends Item {
	private String author;
	
	public WrittenItem() {
		super();
	}

	public WrittenItem(String author) {
		super();
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

//	@Override
//	public String toString() {
//		return "WrittenItem [Author=" + author + "]";
//	}
	
	
}
