package exception;

public class MySkipableException extends Exception{
	
	String name;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public MySkipableException(String str){
		name=str;
	}

}
