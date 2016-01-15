package wk.java.kandy;

public class KandyException extends RuntimeException {

	public KandyException(String message, Throwable cause) {
		super(message, cause);
	}

	public KandyException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 6942405942942529466L;

}
