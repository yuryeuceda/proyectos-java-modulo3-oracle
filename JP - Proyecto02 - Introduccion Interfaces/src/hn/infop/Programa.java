package hn.infop;

public class Programa {
	public static void main(String[] args) {
		// Creamos un ventilador
		Ventilador v1 = new Ventilador();
		v1.encender();
		v1.subirVolumen();
		v1.subirVolumen();
		v1.apagar();
		// Creamos un televisor
		Televisor tv1 = new Televisor();
		tv1.encender();
		tv1.subirVolumen();
		tv1.bajarVolumen();
		tv1.apagar();
	}
}