import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Programa {
	public static void main(String[] args) {
		String nombreArchivo = "C:\\Users\\euced\\OneDrive\\Escritorio\\INFOP\\Oracle Academy\\Promocion 4 - 2023\\Java M3 P4 6-9 Yury Euceda\\workspace\\JP - Proyecto49 - Lectura de Archivos Metodo Nuevo\\archivos\\mascotas.txt";
		// Paso 1: Creamos un objeto Path a partir de la ruta del Archivo y la clase Paths
		Path rutaArchivo = Paths.get(nombreArchivo);
		try {
			// Mala codificación:
			//BufferedReader reader = Files.newBufferedReader(rutaArchivo, Charset.forName("ISO-8859-1"));
			// Paso 2: Creamos un objeto bufferedReader a partir de el objeto path y la clase Files
			BufferedReader reader = Files.newBufferedReader(rutaArchivo, Charset.forName("UTF-8"));
			String lineaTexto = reader.readLine();
			while( lineaTexto != null ) {
				System.out.println(lineaTexto);
				lineaTexto = reader.readLine();
			}
			// Cerramos el buffer
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
