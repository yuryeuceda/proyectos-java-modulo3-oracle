import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Programa {

	public static void main(String[] args) {
		// Creamos un objeto de tipo Jugador
		Jugador alex = new Jugador();
		alex.nombre = "Alexander";
		alex.x = 750;
		alex.y = 200;
		alex.z = 15;
		// Serializacion
		Path carpeta = Paths.get("jugadores/serializados");
		try {
			// Creamos una carpeta
			Files.createDirectories(carpeta);
			String strArchivo = "alex.obj";
			// Creamos un objeto FileOutputStream
			String strRutaArchivo = carpeta.resolve(strArchivo).toString();
			System.out.println(strRutaArchivo);
			FileOutputStream fStream = new FileOutputStream(strRutaArchivo);
			// Creamos un objeto ObjectOutputStream
			ObjectOutputStream oStream = new ObjectOutputStream(fStream);
			// Enviamos el objeto al archivo
			oStream.writeObject(alex);
			// Cerramos los recursos
			oStream.close();
			fStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Creamos un objeto File
	}
}