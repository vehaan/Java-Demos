package library;

public abstract class Item {
	
	private int idNumber;
	private String Title;
	private int copies;
	
	abstract void checkIn();
	abstract void checkOut();
	abstract void addItem();
	
	public Item() {
		super();
	}
	
	public Item(int idNumber, String title, int copies) {
		super();
		this.idNumber = idNumber;
		Title = title;
		this.copies = copies;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	
	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
//		result = prime * result + idNumber;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Item other = (Item) obj;
//		if (Title == null) {
//			if (other.Title != null)
//				return false;
//		} else if (!Title.equals(other.Title))
//			return false;
//		if (idNumber != other.idNumber)
//			return false;
//		return true;
//	}
//	
//	@Override
//	public String toString() {
//		return "Item [idNumber=" + idNumber + ", Title=" + Title + ", copies=" + copies + "]";
//	}
	
}
