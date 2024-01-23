import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Programa {
	public static void main(String[] args) {
		String nombreArchivo = "C:\\Users\\euced\\OneDrive\\Escritorio\\INFOP\\Oracle Academy\\Promocion 4 - 2023\\Java M3 P4 6-9 Yury Euceda\\workspace\\JP - Proyecto50 - Escritura Archivos Metodo Nuevo\\archivos\\mascotas.txt";
		// Paso 1: Creamos un objeto Path a partir de la ruta del Archivo y la clase Paths
		Path rutaArchivo = Paths.get(nombreArchivo);
		try {
			// Paso 2: Creamos un objeto bufferedWritter a partir de el objeto path y la clase Files. 
			// Modo APPEND para agregar al final del archivo
			BufferedWriter writer = Files.newBufferedWriter(rutaArchivo, StandardOpenOption.CREATE );
			// Agregamos dos mascotas al final del archivo
			writer.write("\nTedy");
			writer.write("\nPeluso");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
