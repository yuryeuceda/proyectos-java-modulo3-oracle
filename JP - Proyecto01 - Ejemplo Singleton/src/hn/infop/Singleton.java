package hn.infop;
// Esta clase solo va a permitir una instancia a partir de ella
// La palabra final esteriliza la clase, ya no puede tener hijas
public final class Singleton {
	private static Singleton instancia;
	// Definimos su construtor como privado
	private Singleton() {
		System.out.println("<INFO> Se creó una instancia.");
	}
	
	// Definimos un método para obtener la instancia
	public static Singleton obtenerInstancia() {
		if(instancia == null) instancia = new Singleton();
		return instancia;
	}
}