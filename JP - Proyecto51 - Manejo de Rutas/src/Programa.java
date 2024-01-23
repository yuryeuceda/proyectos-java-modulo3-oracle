import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Programa {

	public static void main(String[] args) {
		// Para crear una ruta podemos usar la abstracción FileSystem
		FileSystem fs = FileSystems.getDefault();
		// Puedo obtener el separador del sistema de archivos actual
		String separador = fs.getSeparator();
		System.out.println("El separador de rutas es " + separador);
		// Creamos una ruta: Relativa
		Path ruta1 = fs.getPath("honduras", "olancho", "catacamas");
		// Validamos si ruta1 es absoluta o relativa
		boolean ruta1EsAbsoluta = ruta1.isAbsolute();
		System.out.println("La ruta " + ruta1 + " es " + ( ruta1EsAbsoluta ? "absoluta" : "relativa" ) );
		Path ruta1Absoluta = ruta1.toAbsolutePath();
		System.out.println(ruta1Absoluta);
		
		// Creamos una ruta: Absoluta
		Path ruta2 = fs.getPath("C:", "honduras", "olancho", "catacamas", "centro_de_saludo.xlsx");
		// Validamos si ruta2 es absoluta o relativa
		boolean ruta2EsAbsoluta = ruta2.isAbsolute();
		System.out.println("La ruta " + ruta2 + " es " + ( ruta2EsAbsoluta ? "absoluta" : "relativa" ) );
		Path ruta2NombreArchivo = ruta2.getFileName();
		System.out.println(ruta2NombreArchivo);
		System.out.println("La ruta " + ruta2 + " se compone de " + ruta2.getNameCount() + " nodos ");
		// Vamos a convertir la ruta2 en URI
		URI uri2 = ruta2.toUri();
		System.out.println("uri2 = " + uri2);
	
		// Es posible iterar en una ruta. Vamos a iterar en la ruta1Absoluta
		System.out.println("Iterando los nodos de la ruta1 Absoluta");
		Iterator<Path> iterador = ruta1Absoluta.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		Path ruta3 = Paths.get("../../paginas/ferreteria/../imagenes/logo2.png");
		// La ruta3 es redundante. Quitamos la redundancia mediante normalize
		Path ruta3NoRedundante = ruta3.normalize();
		System.out.println("Ruta 3 Redundante:  " + ruta3);
		System.out.println("Ruta 3 No Redundante:  " + ruta3NoRedundante);
		
		Path ruta4 = Paths.get("sistemas/paginas/ferreteria/imagenes/logo.png");
		// Es posible obtener una subruta: con el nodo 1 y el nodo2: paginas/ferreteria
		Path subruta = ruta4.subpath(1, 3);
		System.out.println("subruta: " + subruta);
		
	}

}