
public class Programa {

	public static void main(String[] args) {
		// Lo siguiente me da error porque Object no es clase
		// Figura ni una de sus clases hija.
		//Pareja<Object, String> p01 = new Pareja<Object, String>();
		Pareja<Figura, String> p01 = new Pareja<Figura, String>();
		Pareja<Triangulo, Integer> p02 = new Pareja<Triangulo, Integer>();
		Pareja<Isoceles, Boolean> p03 = new Pareja<Isoceles, Boolean>();
		
		
		Pareja<String, Integer> nombreEdad = new Pareja<String, Integer>();
		nombreEdad.elemento1 = "Manuel Rosales";
		nombreEdad.elemento2 = 42;
		
		Pareja<Double, Double> coordenadas = new Pareja<Double, Double>();
		coordenadas.elemento1 = 15.27;
		coordenadas.elemento2 = 93.75;
		
		// Uso de comodines o wilcards
		// El primer elemento puede ser de tipo numérico: Integer, Double, Long, Float, ...
		// El segundo elemento puede ser de tipo Object, Figura
		Pareja<? extends Number, ? super Triangulo> parejaRara;
		// Le asignamos un objeto a la variable parejaRara
		parejaRara = new Pareja< Integer  ,  Triangulo >();
		
		parejaRara = new Pareja< Double, Figura >();
		
		parejaRara = new Pareja< Long, Object>();
		
		Pareja< Integer, Integer> parejaEnteros = new Pareja<Integer, Integer> ();
		parejaEnteros.elemento1 = 50;
		parejaEnteros.elemento2 = 100;
		double prom = promedio( parejaEnteros );
		System.out.println("el promedio de parejaEnteros es " + prom);
		
		Pareja< Long, Double > parejaLongDouble = new Pareja< Long, Double >();
		parejaLongDouble.elemento1 = 1_000_000_000L;
		parejaLongDouble.elemento2 = 1_000_000_000.0;
		prom = promedio( parejaLongDouble );
		System.out.println("el promedio de parejaLongDouble es " + prom);
	}

	public static double promedio(  Pareja<  ? extends Number ,  ? extends Number  > pareja   ) {
		double elemento1 = pareja.elemento1.doubleValue();
		double elemento2 = pareja.elemento2.doubleValue();
		double resultado = elemento1 + elemento2;
		return resultado / 2.0;
	}
		
	
	
}
