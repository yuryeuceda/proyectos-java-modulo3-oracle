public class Programa {

	public static void main(String[] args) {
		String cadena1 = "";
		System.out.println( "hashcode inicial de cadena1: " + cadena1.hashCode() );
		long tiempoInicial = System.nanoTime();
		for(int i = 0; i < 1000 ; i++) {
			cadena1 += "a";
		}
		long tiempoFinal =  System.nanoTime();
		System.out.println( "hashcode final de cadena1: " + cadena1.hashCode() );
		long tiempoTranscurrido1 = tiempoFinal - tiempoInicial;
		System.out.println("Concatenar una String se tardó: " + tiempoTranscurrido1 + " nanosegundos");
		// Version usando StringBuilder
		StringBuilder cadena2 = new StringBuilder();
		System.out.println( "hashcode inicial de cadena2: " + cadena2.hashCode() );
		tiempoInicial = System.nanoTime();
		for(int i = 0; i < 1000 ; i++) {
			cadena2.append("a");
		}
		tiempoFinal = System.nanoTime();
		System.out.println( "hashcode final de cadena2: " + cadena2.hashCode() );
		long tiempoTranscurrido2 = tiempoFinal - tiempoInicial;
		System.out.println("Concatenar un StringBuilder se tardó: " + tiempoTranscurrido2 + " nanosegundos");
		double vecesMejor = tiempoTranscurrido1 / (double) tiempoTranscurrido2 ;
		System.out.println("StringBuilder es " + vecesMejor + " veces mejor que String");

		
	}
}