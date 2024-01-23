package hn.infop;
public class Programa {
	public static void main(String[ ] args) {
		Circulo c1 = new Circulo( );
		c1.radio = 3;
		System.out.println( "El area del circulo c1 es " + c1.area( ));
		
		Rectangulo r1 = new Rectangulo( );
		r1.alto = 5;
		r1.ancho = 3;
		System.out.println("El area del rectangulo r1 es " + r1.area());
				
		// Se viene el polimorfismo
		Figura f = c1;
		
		boolean fControlaRectangulo = f instanceof Rectangulo;
		boolean fControlaCirculo = f instanceof Circulo;
		boolean fControlaTriangulo = f instanceof Triangulo;
		
		// ¿Que me diria (f instanceof Circulo) ? SI 
		System.out.println("<Circulo> f.area() => " + f.area());
		
		f = r1;
		// ¿Que me diria (f instanceof Circulo) ? NO 
		// ¿Que me diria (f instanceof Rectangulo) ? SI		
		System.out.println("<Rectangulo> f.area() => " + f.area());
		
		// Una variable de tipo interfaz va controlar al circulo
		IDibujable d = c1;
		d.dibujar();
		
		d = r1;
		d.dibujar();
	}
}