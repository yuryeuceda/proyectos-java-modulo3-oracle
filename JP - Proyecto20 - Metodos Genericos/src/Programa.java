import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		saludeA("Carlos");
		saludeA(25);
		saludeA(true);
		saludeA(48.3);
		
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Luis");
		//double promedioEdades = promedio(nombres);
	
		
		ArrayList<Integer> edades = new ArrayList<Integer>();
		edades.add(28);
		edades.add(17);
		edades.add(23);
		double promedioEdad = promedio(edades);
		System.out.println("El promedio de la edad es "+promedioEdad);
		
		ArrayList<Double> estaturas = new ArrayList<Double>();
		estaturas.add(1.75);
		estaturas.add(1.68);
		estaturas.add(1.72);
		double promedioEstatura = promedio(estaturas);
		System.out.println("El promedio de la estatura es " + promedioEstatura);
		
	}
	
	public static <TIPO> void saludeA( TIPO valor ) {
		System.out.println("Hola " + valor);
	}
	
	// Metodo genérico
	public static <TIPO extends Number> double  promedio( ArrayList<TIPO> listaNumeros  ) {
		double suma = 0.0;
		for( Number numero : listaNumeros  ) {
			suma += numero.doubleValue();
		}
		return suma / listaNumeros.size();
	}	
	
	
}
































