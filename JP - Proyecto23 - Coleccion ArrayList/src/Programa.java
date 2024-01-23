import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		ArrayList<String> trenDeProductos = new ArrayList<String>();
		trenDeProductos.add("Arroz");
		trenDeProductos.add("Maíz");
		trenDeProductos.add("Harina");
		trenDeProductos.add("Azucar");
		
		Iterator<String> iterador = trenDeProductos.iterator();
		while(iterador.hasNext()) {
			String contenido = iterador.next();
			System.out.print("(" + contenido + ")--->");
		}
		System.out.println();
		
		// Métodos adicionales del ArrayList
		// Obtener el tamaño
		int cantidad = trenDeProductos.size();
		// Buscar un elemento
		int posicionHarina = trenDeProductos.indexOf("Harina");
		// Elimino el elemento que contiene la Harina
		trenDeProductos.remove(posicionHarina);
		// Elimino el elemento que contiene el Azucar
		trenDeProductos.remove("Azucar");
		// Imprimo la coleccion
		System.out.println(trenDeProductos);
		// Agregar elementos al inicio
		trenDeProductos.add(0, "Frutas");
		// Imprimo la coleccion
		System.out.println(trenDeProductos);
		// Agregar elementos al final
		trenDeProductos.add("Verduras");
		// Imprimo la coleccion
		System.out.println(trenDeProductos);
		// Elimino todos los vagones del tren
		trenDeProductos.clear();
		// Verificar si el ArrayList está vacío
		boolean trenVacio = trenDeProductos.isEmpty();
		if(trenVacio) System.out.println("Asaltaron al tren :(");
		// Verificamos si al menos dejaron las verduras
		boolean estanLasVerduras = trenDeProductos.contains("Verduras");
		if(estanLasVerduras) System.out.println("Al menos dejaron las verduras");
		else System.out.println("Los ladrones no perdonaron ni las verduras");
		String [ ] productosNuevos = { "Zapatos" , "Vestidos", "Camisas" };
		// Le voy a ingresar los valores de un arreglo normal a un ArrayList
		trenDeProductos.addAll( Arrays.asList(productosNuevos) );
		System.out.println(trenDeProductos);
		// Cambio el valor de un vagon: De Vestidos a Pantalones
		trenDeProductos.set( 1 , "Pantalones" );
		System.out.println(trenDeProductos);
		// Recupero un valor mediante el indice
		String valorPosicion2 = trenDeProductos.get(2);
		System.out.println("El contenido del vagon 2 es " + valorPosicion2);
		// Obtengo una sublista
		List<String> subLista = trenDeProductos.subList(0, 2);
		System.out.println(subLista);
		
	}
}