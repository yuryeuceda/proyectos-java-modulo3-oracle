package hn.infop;

public class Ventilador implements Caratula {

	@Override public void encender() {
		System.out.println("<Ventilador> Encendido");
	}

	@Override public void apagar() {
		System.out.println("<Ventilador> Apagado");		
	}

	@Override public void subirVolumen() {
		System.out.println("<Ventilador> Subiendo velocidad");
	}

	@Override public void bajarVolumen() {
		System.out.println("<Ventilador> Bajando velocidad");
	}

	@Override public void obtenerInformacion() {
		System.out.println("<Ventilador> Soy un lindo ventilador");
	}
}