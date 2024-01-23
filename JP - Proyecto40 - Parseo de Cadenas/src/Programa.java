import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese su nombre completo:");
		String nombreCompleto = entrada.nextLine();
		// Para separar una cadena el método más facil es usar split
		String separador = " ";
		String [ ] partes = nombreCompleto.split(separador);
		// Imprimimos las partes
		for(String parte : partes) {
			System.out.println(parte);
		}
		
		System.out.println("Ingrese la fecha de nacimiento");
		String fechaNacimiento = entrada.next();
		separador = "[/-]";
		partes = fechaNacimiento.split(separador);
		int añoNacimiento = Integer.parseInt( partes[2] );
		System.out.println("El que nació es " + añoNacimiento);
		int añoActual = Year.now().getValue();
		int edad = añoActual - añoNacimiento;
		System.out.println("Su edad es " + edad);
		
		// Forma alterna de separar una cadena
		String frase = "Hoy el viernes y el cuerpo lo sabe ";
		ArrayList<String> palabras = new ArrayList<String>();
		String palabraActual = "";
		for(int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if(letra != ' ') {
				palabraActual += letra;
			} else {
				palabras.add(palabraActual);
				palabraActual = "";
			}
		}
		
		System.out.println("La frase en pedazos");
		for(String palabra : palabras) {
			System.out.println(palabra);
		}
		
		
		
	}
}