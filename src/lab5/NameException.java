package lab5;

public class NameException extends Exception {

	public NameException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NameException [getMessage()=" + getMessage() + "]";
	}
	
	

}
