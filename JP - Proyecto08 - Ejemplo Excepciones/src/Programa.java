import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		try {
			Fraccion a = new Fraccion();
			// Creamos un Scanner para pedir los valores
			Scanner entrada = new Scanner(System.in);
			// Pedimos el numerador
			System.out.println("Ingrese el numerador:");
			int valor1 = entrada.nextInt();			
			a.setNumerador(valor1);
			// Pedimos el denominador
			System.out.println("Ingrese el denominador:");
			int valor2 = entrada.nextInt();						
			a.setDenominador(valor2);
		} catch(InputMismatchException excepcion) {
			System.out.println("<EXCEPCION> No ingresó un número");
			//System.out.println(excepcion.getMessage());
		} catch(DenominadorCeroException excepcion) {	
			System.out.println(excepcion.getMessage());
		} catch(Exception excepcion) {
			System.out.println(excepcion.getMessage());
		} finally {
			// El bloque finally es opcional y se ejecuta si ocurrió o no
			// una excepcion
			System.out.println("Dentro del bloque finally");
		} 
		
		System.out.println("<FIN> Fin del programa");
	}
}