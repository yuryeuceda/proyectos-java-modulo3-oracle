import java.util.HashMap;
public class Programa {
	public static void main(String[] args) {
		// Necesitamos asociar los paises de CA con sus capitales
		// Solución: Uso un Mapa Hash para asociarlos
		HashMap< String , String > mapPaisesCapitales = new HashMap< String , String>( );
		// Ahora asociamos cada país con su capital
		mapPaisesCapitales.put( "Honduras", "Tegucigalpa" );
		mapPaisesCapitales.put( "Guatemala", "Ciudad de Guatemala" );
		mapPaisesCapitales.put( "El Salvador", "San Salvador" );
		mapPaisesCapitales.put( "Nicaragua", "Managua" );
		mapPaisesCapitales.put( "Costa Rica", "San José" );
		
		boolean estaPanama		= mapPaisesCapitales.containsKey("Panama");
		boolean estaBelmopan	= mapPaisesCapitales.containsValue("Belmopan");
		
		if(estaPanama	== false) System.out.println("No incluye Panama en el mapa hash");
		if(estaBelmopan == false) System.out.println("No incluye Belmopan en el mapa hash");
		
		System.out.println("Imprimiendo el mapa hash");
		for( String pais : mapPaisesCapitales.keySet( ) ) {
			String capital = mapPaisesCapitales.get(pais);
			//System.out.println(  String.format( "La capital de %s es %s %07.2f", pais , capital,  00023.10 ) );
			System.out.println(  String.format( "La capital de %s es %s", pais , capital ) );
			System.out.println("La capital de " + pais + " es " + capital);
		}
	}
}