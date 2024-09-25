package exceptions;

public class TransactionException extends Exception {

	public TransactionException(String str) {
		super(str);
	}
	
	@Override
	public String toString() {		
		return "Trasaction Declined";
	}
}
