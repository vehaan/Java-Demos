package practice;

public class ExceptionDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("Sample Exception");
		} catch(Exception e){
			System.err.println("getMessage(): " + e.getMessage());
			System.err.println("getLocalizedMessage(): " + e.getLocalizedMessage());
			System.err.println("getCause(): " + e.getCause());
			System.err.println("printStackTrace(): ");
			 e.printStackTrace();
			 System.err.println("fillInStackTrace(): ");
			 e.fillInStackTrace();
			 e.printStackTrace();
		}
		Exception e = new Exception();
		System.out.println(e);

	}

}
