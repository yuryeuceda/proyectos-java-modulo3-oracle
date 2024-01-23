import java.util.Arrays;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		/*
			 Reglas de un password:
			1.- Debe llevar como minimo una minuscula
			2.- Debe llevar como minimo una mayuscula
			3.- Debe llevar como minimo un digito
			4.- Debe llevar como minimo un signo de puntuacion
			5.- Debe tener como minimo 8 caracteres
		 */
		Scanner entrada = new Scanner(System.in);
		boolean [ ] reglasCumplidas = new boolean[5]; 
		System.out.println("Ingrese un password para validarlo:");
		String password = entrada.next();
		// Validaciones:
		reglasCumplidas[0] = password.matches(".*[a-z].*");
		reglasCumplidas[1] = password.matches(".*[A-Z].*");
		reglasCumplidas[2] = password.matches(".*[0-9].*");
		reglasCumplidas[3] = password.matches(".*[!@#$%&=_\\-+*].*");
		reglasCumplidas[4] = password.matches(".{8,}");
		int conteoReglas = 0;
		for(boolean regla : reglasCumplidas) {
			conteoReglas += regla ? 1 : 0;
		}
		System.out.println("Se cumplieron: " + conteoReglas + " reglas de " + reglasCumplidas.length);
		System.out.println(Arrays.toString(reglasCumplidas));
		if(!reglasCumplidas[0]) System.out.println("Su password no lleva ni una minúscula a-z");
		if(!reglasCumplidas[1]) System.out.println("Su password no lleva ni una mayúscula A-Z");
		if(!reglasCumplidas[2]) System.out.println("Su password no lleva ni un digito del 0 al 9");
		if(!reglasCumplidas[3]) System.out.println("Su password no lleva ni un caracter especial !@#$%&=_-+*");
		if(!reglasCumplidas[4]) System.out.println("Su password tiene menos de 8 caracteres");
		// Reto:
		// Hay una regla no escrita o especificada que debe definirse y es la que excluya caracteres no
		// permitidos en el password.
	}
}