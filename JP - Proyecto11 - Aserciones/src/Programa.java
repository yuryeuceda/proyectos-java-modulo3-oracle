import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un número entre 1 y 10 (Ambos inclusive)");
		int numero = entrada.nextInt();
		// Las aserciones sirven como puntos de validación dentro del código
		assert numero >= 1 && numero <= 10 : "No ingresó el numero entre 0 y 12";
		System.out.println("El doble de ese número es "+(2*numero));
		
	}

}