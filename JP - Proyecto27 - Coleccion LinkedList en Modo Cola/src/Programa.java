import java.util.LinkedList;
public class Programa {
	public static void main(String[] args) {
		// Creamos una Lista Enlazada o LinkedList
		LinkedList< String > lstColaSuper = new LinkedList< String >( ) ;
		// El supermecado solo tiene un cajero :( y aun no ha encendido el sistema
		// Llega Mario como primero de la fila
		lstColaSuper.add("Mario");
		System.out.println("La fila está así:" + lstColaSuper);
		// Luego llego Daniel despues de Mario, el sistema aun no arranca
		lstColaSuper.add("Daniel");
		System.out.println("La fila está así:" + lstColaSuper);
		// Luego lleva Maria despues de Daniel, el sistema aun no arranca
		lstColaSuper.add("Maria");
		System.out.println("La fila está así:" + lstColaSuper);
		// El sistema arranca y el cajero despacha al primero de la lista
		String despachado = "";
		despachado = lstColaSuper.removeFirst();
		System.out.println("Despachado: " + despachado);
		System.out.println("La fila está así:" + lstColaSuper);
		// En ese momento llega Alberto
		lstColaSuper.add("Alberto");
		System.out.println("La fila está así:" + lstColaSuper);
		// El cajero despacha al que estaba de primero en la cola
		despachado = lstColaSuper.removeFirst();
		System.out.println("Despachado: " + despachado);
		System.out.println("La fila está así:" + lstColaSuper);
		despachado = lstColaSuper.removeFirst();
		System.out.println("Despachado: " + despachado);
		System.out.println("La fila está así:" + lstColaSuper);
		despachado = lstColaSuper.removeFirst();
		System.out.println("Despachado: " + despachado);
		System.out.println("La fila está así:" + lstColaSuper);
		if( lstColaSuper.isEmpty( ) ) System.out.println("El cajero puede ir a almozar porque la fila está vacía");
	}
}