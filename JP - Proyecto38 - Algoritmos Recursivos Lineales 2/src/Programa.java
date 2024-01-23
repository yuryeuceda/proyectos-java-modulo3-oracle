public class Programa {

	public static int dividir(int a, int b) throws ArithmeticException {
		// Caso(s) base
		if(b == 1) return a;
		if(a == b) return 1;
		if(a == 0) return 0;
		if(b == 0) throw new ArithmeticException();
		if(a < b) return 0;
		// Caso recursivo
		return  1 + dividir(a - b , b);
	}
	
	public static void main(String[] args) {
		int m = 17, n = 3;
		int p =dividir( m , n );
		System.out.println( String.format("Dividir %d con %d es %d", m, n, p) );
		System.out.println("Dividir " + m + " con " + n + " es " + p);
	}
}