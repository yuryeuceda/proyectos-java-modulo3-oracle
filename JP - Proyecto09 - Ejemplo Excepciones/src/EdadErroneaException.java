public class EdadErroneaException extends Exception {
	@Override public String getMessage() {
		return "<EdadErroneaException> Ingresó una edad erronea";
	}	
}