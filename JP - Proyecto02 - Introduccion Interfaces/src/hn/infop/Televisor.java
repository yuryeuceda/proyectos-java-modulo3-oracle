package hn.infop;

public class Televisor implements Caratula{

	@Override public void encender() {
		System.out.println("<Televisor> Encendido");
	}

	@Override public void apagar() {
		System.out.println("<Televisor> Apagado");
	}

	@Override public void subirVolumen() {
		System.out.println("<Televisor> Subiendo volumen");
	}

	@Override public void bajarVolumen() {
		System.out.println("<Televisor> Bajando volumen");
	}

	@Override public void obtenerInformacion() {
		System.out.println("<Televisor> Soy un televisor");
	}
}
