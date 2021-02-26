package lab5;

public class AgeException extends RuntimeException {
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	String message = "Age should be above 15 years!";

	public AgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeException(String message) {
		super(message);
		this.message = message;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AgeException [message=" + message + "]";
	}
	
	

}
