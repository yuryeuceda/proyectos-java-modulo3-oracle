public class Programa {

	public static int ops = 0;
	public static int busquedaSecuencial(String buscado, String [ ] arreglo) {
																								ops += 2;		// Asignacion, Comparacion 
		for( int i = 0    ;  i < arreglo.length    ;  i++   ) {					ops += 2;		// Incremento, Comparacion
																								ops += 1;		// Comparacion
			if(buscado.equals( arreglo[ i ] ) ) return i; 
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//String [ ] tiendas = { "Rojo" };
		//String [ ] tiendas = { "Rojo", "Verde" };
		//String [ ] tiendas = { "Rojo", "Verde", "Azul" };
		//String [ ] tiendas = { "Rojo", "Verde", "Azul", "Amarillo" };
		String [ ] tiendas = { "Rojo", "Verde", "Azul", "Amarillo", "Negro"  };
		String colorBuscado = "Lila";
		ops = 0;
		int numeroTiendaEncontrado = busquedaSecuencial( colorBuscado, tiendas);
		if(numeroTiendaEncontrado == -1) System.out.println("El vestido con ese color no está en ninguna tienda");
		else System.out.println("El vestido de color " + colorBuscado + " está en la tienda " + numeroTiendaEncontrado);
		System.out.println("Para " + tiendas.length + " elementos se realizaron " + ops + " operaciones");
	}
}