
public class Programa {

	public static void main(String[] args) {
		Persona juan = new Persona();
		juan.nombre = "Juan Perez";
		juan.identidad = "0501199812345";
		
		Persona juanchi = new Persona();
		juanchi.nombre = "Juan Perez";
		juanchi.identidad = "0501199812345";
		if(juan.esIgualA(juanchi)) {
			System.out.println("Juan y Juanchi SI son los mismos");
		} else {
			System.out.println("Juan y Juanchi NO son los mismos");
		}

		Mascota bob = new Mascota();
		bob.nombre = "Bob";
		bob.raza = "Dalmata";
		
		Mascota terry = new Mascota();
		terry.nombre = "Terry";
		terry.raza = "Terrier";
		
		// Polimorfismo
		Comparable c1 = bob;
				
		if(c1.esIgualA(terry)) {
			System.out.println("Bob y Terry SI son los mismos");
		} else {
			System.out.println("Bob y Terry NO son los mismos");
		}
		
	}

}
