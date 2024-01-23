package hn.infop;
public class Circulo extends Figura implements IDibujable {
	public double radio;
	@Override public double area() {
		return Math.PI * radio * radio;
	}
	@Override public void dibujar() {
		System.out.println("Soy un circulo y me estoy dibujando");
	}
}