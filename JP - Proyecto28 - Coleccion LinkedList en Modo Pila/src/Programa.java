import java.util.LinkedList;

public class Programa {
	public static void main(String[] args) {
		// Creamos una Lista Enlazada que la vamos a tratar como una Pila
		LinkedList< String > pilaDeLibros = new LinkedList < String >( );
		// Vamos a agregar el primer libro a la pila
		pilaDeLibros.push( " Harry Potter y el Caliz de Fuego " );
		System.out.println("La pila de libros queda: " + pilaDeLibros);
		// Vamos a agregar el segundo libro a la pila
		pilaDeLibros.push("El retorno del rey");
		System.out.println("La pila de libros queda: " + pilaDeLibros);
		// Vamos a agregar el tercer libro a la pila
		pilaDeLibros.push("El popol vuh");
		System.out.println("La pila de libros queda: " + pilaDeLibros);
		// Vamos a agregar el cuarto libro a la pila
		pilaDeLibros.push("El Quijote de Mancha");
		System.out.println("La pila de libros queda: " + pilaDeLibros);
		// Ahora, vamos a empezar a sacar los libros de la pila
		String libroSacado = "";
		libroSacado = pilaDeLibros.pop();
		System.out.println("Se sacó de la pila el libro:" + libroSacado);
		System.out.println("La pila de libros queda: " + pilaDeLibros);
		
	}
}