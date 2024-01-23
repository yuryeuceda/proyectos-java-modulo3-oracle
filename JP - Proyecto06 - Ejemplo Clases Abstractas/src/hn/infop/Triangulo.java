package hn.infop;

public class Triangulo extends Figura implements IDibujable {
	public double base;
	public double altura;
	@Override public double area() {
		return 0.5 * base * altura;
	}
	@Override public void dibujar() {
		System.out.println("Soy un triangulo y me estoy dibujando");
	}
}