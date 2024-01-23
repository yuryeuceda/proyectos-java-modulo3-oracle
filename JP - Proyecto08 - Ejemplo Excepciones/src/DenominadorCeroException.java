public class DenominadorCeroException extends Exception {
	private String mensaje;
	// Creamos el constructor con parametros
	public DenominadorCeroException(String mensaje) {
		this.mensaje = mensaje;
	}	
	// Creamos el constructor sin parametros
	public DenominadorCeroException() {
		this.mensaje = "No se permite cero en el denominador";
	}
	// Redefinir el metodo getMessage
	@Override public String getMessage() {
		return this.mensaje;
	}
}