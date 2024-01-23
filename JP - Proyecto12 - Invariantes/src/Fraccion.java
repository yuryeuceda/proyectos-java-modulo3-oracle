
public class Fraccion {
	private int numerador;
	private int denominador;
	public Fraccion(int a, int b) {
		assert b != 0 : "El denominador no debe ser cero";
		this.numerador = a;
		this.denominador = b;
	}
}
