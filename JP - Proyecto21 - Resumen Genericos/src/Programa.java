import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		ArrayList<Object> listaDeCosas = new ArrayList<Object>();
		listaDeCosas.add("Juan");
		listaDeCosas.add(25);
		listaDeCosas.add(false);
		
		// Puesto los elementos de la se tratan como Object, para recuperarlos
		// necesito hacerles Casting y saber que era cada uno antes entrar a la lista
		String nombre = (String) listaDeCosas.get(0);
		int edad = (int) listaDeCosas.get(1);
		boolean traba = (boolean) listaDeCosas.get(2);

		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Ana");
		nombres.add("José");
		
		//ArrayList<? extends Number> valores = new ArrayList< Integer >();
		//valores.add(23.5);
	}

}