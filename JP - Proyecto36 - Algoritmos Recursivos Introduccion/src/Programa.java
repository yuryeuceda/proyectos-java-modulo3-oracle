
public class Programa {

	// Algoritmo recursivo que imprime numeros del n al 1
	public static void imprimirDescendente(int n) {
		// Caso base o caso final o caso conocido
		if(n == 0) return;
		
		System.out.println(n);
		// Caso recursivo : lineal Solo llama 1 vez a si misma
		imprimirDescendente(n - 1);
	}

	public static void imprimirAscendente(int n, int m) {
		// Caso base o caso final o caso conocido
		if(n == m) return;
		
		System.out.println(n);
		// Caso recursivo : lineal Solo llama 1 vez a si misma
		imprimirAscendente(n + 1, m);
	}
	
	public static void main(String[] args) {
		System.out.println("Loop descendente con recursividad");
		imprimirDescendente(5);
		System.out.println("Loop ascendente con recursividad");
		imprimirAscendente(1,100000);
		System.out.println("Fin del programa");
	}
}