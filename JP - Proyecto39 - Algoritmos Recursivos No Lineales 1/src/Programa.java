
public class Programa {

	public static int fibonaci(int n) {
		// Casos base
		if(n == 1) return 1;
		if(n == 2) return 1;
		// Caso recursivo no lineal
		return fibonaci(n-1) + fibonaci(n-2);
	}
	
	public static void main(String[] args) {
		int p = 6;
		int q = fibonaci(p);
		System.out.println("El fibonaci de "+p+" es " + q);
	}

}
