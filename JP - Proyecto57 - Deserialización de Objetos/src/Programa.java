import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
public class Programa {
	public static void main(String[ ] args) {
		String carpetaJugadores = "jugadores/serializados";
		// Obtenemos la lista de archivos
		File [ ] archivosSerializados = new File(carpetaJugadores).listFiles( );
		// Creamos un ArrayList para guardar los objetos
		ArrayList<Jugador> lstJugadores = new ArrayList<Jugador>( );
		// Iteramos los archivos
		for( File archivoJugador : archivosSerializados ) {
			try {
				// Creamos un objeto FileInputStream 
				FileInputStream fStream = new FileInputStream(archivoJugador);
				// Creamos un objeto ObjectInputStream
				ObjectInputStream oStream = new ObjectInputStream(fStream);
				// Reconstruimos el objeto en memoria a partir de la serialización en el archivo
				Jugador jugador = (Jugador) oStream.readObject();
				// Agregamos el objeto a la lista
				lstJugadores.add(jugador);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		// Una vez cargados los objetos en memoria procedo a imprimirles
		for(Jugador j : lstJugadores) {
			System.out.println("nombre:"+j.nombre+", x="+j.x+", y="+j.y+",z="+j.z);
		}
	}
}