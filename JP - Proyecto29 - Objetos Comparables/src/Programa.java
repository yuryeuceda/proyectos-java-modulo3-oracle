import java.util.ArrayList;
import java.util.Collections;

public class Programa {
	public static void main(String[] args) {
		Persona juan = new Persona("Juan Perez", 28, 1.80);
		Persona pedro = new Persona("Pedro Martinez", 31, 1.72);
		// ¿Cómo puedo comparar a juan y pedro?
		// ¿Cómo logro saber quién es mayor y quién es menor?
		
		if( juan.compareTo(pedro) > 0 ) {
			System.out.println("Juan es Mayor que Pedro");
		} else if( juan.compareTo(pedro) < 0 ){
			System.out.println("Pedro es Mayor que Juan");
		} else {
			System.out.println("Pedro y Juan tienen la misma edad");
		}
		
		Persona luis = new Persona("Luis Reyes", 44, 1.68);
		Persona diana = new Persona("Diana Fernandez", 19, 1.65);
		// Creo una coleccion para agregar las personas
		ArrayList<Persona> lstPersonas = new ArrayList<Persona>();
		// Agrego las personas
		lstPersonas.add(juan);
		lstPersonas.add(pedro);
		lstPersonas.add(diana);
		lstPersonas.add(luis);
		System.out.println("Previo a ordenar:"+lstPersonas);
		// Ordeno la colección
		Collections.sort( lstPersonas );
		System.out.println("Después de ordenar:"+lstPersonas);
	}
	
	
	public static void compararPersonas(Persona p1, Persona p2) {
		if(p1.edad > p2.edad ) {
			System.out.println(p1.nombres +" es Mayor que "+p2.nombres);
		} else if(p1.edad < p2.edad){
			System.out.println(p2.nombres+" es Mayor que "+p1.nombres);
		} else {
			System.out.println(p1.nombres+" y "+p2.nombres+" tienen la misma edad");
		}		
	}
}