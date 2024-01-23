
public class Programa {

	public static void main(String[] args) {
		StringBuilder cadena = new StringBuilder();
		long tiempo1 = System.nanoTime();
		for(int i = 0; i< 1000; i++) {
			cadena.append('a');
		}
		long tiempo2 = System.nanoTime();
		long duracion = tiempo2 - tiempo1;
		System.out.println("La duracion fue " + duracion);
		System.out.println(cadena);
		
	}

}
