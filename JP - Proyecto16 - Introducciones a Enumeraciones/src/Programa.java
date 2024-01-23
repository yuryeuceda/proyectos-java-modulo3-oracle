public class Programa {
	public static void main(String[] args) {
		// Creamos un boleto
		Boleto ticket1 = new Boleto( );
		ticket1.evento = "Concierto Mägo de Oz";
		ticket1.tipo = TipoBoleto.VIP;
		
		// Creamos otro boleto
		Boleto ticket2 = new Boleto( );
		ticket2.evento = "Concierto de Coldplay";
		ticket2.tipo = TipoBoleto.SILLA;
		
		// Creamos otro boleto
		Boleto ticket3 = new Boleto( );
		ticket3.evento = "Tierra Santa";
		ticket3.tipo = TipoBoleto.GRADERÍA;

		// Los enumerados se tratan como items dentro de una colección
		System.out.println("Listado de tipos de boleto");
		for( TipoBoleto tipo : TipoBoleto.values( )  ) {
			System.out.println("nombre:" + tipo.name( ) );
			System.out.println("ordinal:" + tipo.ordinal( ) );
			System.out.println("------------------------------------------------");
		}
	}
}