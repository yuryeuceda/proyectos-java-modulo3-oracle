package hn.infop;
public class Rectangulo extends Figura implements IDibujable {
	public double ancho;
	public double alto;
	@Override public double area() {
		return ancho * alto;
	}
	@Override public void dibujar() {
		System.out.println("Soy un rectangulo y me estoy dibujando");
	}
}