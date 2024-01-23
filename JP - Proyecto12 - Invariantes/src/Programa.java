import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Invarianza interna
		Scanner entrada = new Scanner(System.in);
		System.out.println("Estudia o Trabaja (E/T)");
		char letra = entrada.next().charAt(0);
		// Aqui validamos que letra sea E o T
		assert letra == 'E' || letra == 'T' : "Ingresó el caracter equivocado";
		
		// Contro de flujo con invarianza : En este ejemplo nos damos cuenta que los case no tienen break
		switch(letra) {
		case 'E':
			System.out.println("La persona estudia");
			assert letra == 'E';
			break;
		case 'T':		
			System.out.println("La persona trabaja");
			assert letra == 'T';
			break;
		}
		// Invarianza en clases
		Fraccion p = new Fraccion(1,0);
	}
}