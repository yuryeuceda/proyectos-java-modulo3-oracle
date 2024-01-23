public class Fraccion {
	// Atributos
	private int numerador;
	private int denominador;
	// Constructores
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public Fraccion() {
	}
	// Metodos set y get
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	// Cuando marcamos un método con throws Exception
	// Le estamos indicando al programador que va usar mi clase
	// que tenga cuidado con este método:
	public void setDenominador(int valor) throws Exception {
		if(valor == 0) {
			//throw new Exception("<ERROR> El denominador no puede ser 0");
			throw new DenominadorCeroException();
		} else this.denominador = valor;
	}
	// Metodos miscelaneos o de utilería o funcionales
}