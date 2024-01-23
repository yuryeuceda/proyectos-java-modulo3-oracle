
public class Programa {
	// Multiplicacion de forma recursiva utilizando solo sumas y restas
	public static int multiplicar(int a, int b) {
		// Casos base
		if(b == 0) return 0;
		if(b == 1) return a;
		// Caso especial: Para manejar los negativos. Este caso no es ni base ni recursivo
		if(b < 0) return - multiplicar( a, - b );		
		// Caso recursivo
		return multiplicar(a, b - 1) + a;
	}
	
	public static void main(String[] args) {
		int m = -7, n = -4;
		int p = multiplicar( m , n );
		System.out.println( String.format("Multiplicar %d con %d es %d", m, n, p) );
		System.out.println("Multiplicar " + m + " con " + n + " es " + p);
	}

}
