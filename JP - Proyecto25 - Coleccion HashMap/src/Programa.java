import java.util.HashMap;
public class Programa {
	public static void main(String[] args) {
		// Vamos a crear un arreglo para contener los nombres y edades
		String [ ] nombres = new String[4];
		int [ ] edades = new int[4];
		// Agregamos los nombres y las edades
		nombres[0]	=	"Luis"	;	edades[0]	= 17;
		nombres[1]	=	"Pedro";	edades[1]		= 21;
		nombres[2]	=	"Ana"	;	edades[2]	= 33;
		nombres[3]	=	"José"	;	edades[3]	= 14;
		// Imprimimos los arreglos
		for(int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			int edad = edades[i];
			System.out.println(nombres + " tiene " + edad + " años ");
		}
		// Forma alternativa usando la colección HashMap
		System.out.println("Usando mapas hash");
		HashMap<  String , Integer  > mapNombresEdades = new HashMap< String , Integer >( );
		// Asocio cada nombre con su edad
		mapNombresEdades.put("Luis"		, 17);
		mapNombresEdades.put("Pedro"	, 21);
		mapNombresEdades.put("Ana"	, 33);
		mapNombresEdades.put("José"		, 14);
		// Imprimo el Mapa Hash o arreglo asociativo
		for( String llave : mapNombresEdades.keySet() ) {
			int valor = mapNombresEdades.get(llave);
			System.out.println(llave + " tiene " + valor + " años ");
		}		
		
	}
}