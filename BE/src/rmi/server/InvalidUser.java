package es.deusto.ingenieria.sd.rmi.server;

public class InvalidUser extends Exception 
{

	private String message;
	
	
	public InvalidUser() {
		super();
		this.message = "";		
	}
	
	public InvalidUser(String exceptionMessage) {
		super();
		this.message = exceptionMessage;
	}
	
	
	public String getErrorMessage() {
		return this.message;
	}

}
