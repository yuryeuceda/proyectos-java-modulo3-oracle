import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Programa {
	public static void main(String[] args) {
		String nombreArchivo = "C:\\Users\\euced\\OneDrive\\Escritorio\\INFOP\\Oracle Academy\\Promocion 4 - 2023\\Java M3 P4 6-9 Yury Euceda\\workspace\\JP - Proyecto48 - Lectura de Archivos Metodo Viejo\\archivos\\mascotas.txt";
		// Paso 1: Creamos un objeto file a partir de la ruta del archivo
		File file = new File(nombreArchivo);
		if( file.exists() ) {
			System.out.println("Procedemos a leer el archivo");
			try {
				// Paso 2: Creamos un objeto fileReader a partir del objeto file
				FileReader reader = new FileReader(file);
				// Paso 3: Creamos un objeto bufferReader a partir del objeto reader
				BufferedReader buffer = new BufferedReader(reader);
				// Ya estamos listos para leer el archivo
				String lineaTexto = buffer.readLine();
				while(lineaTexto != null) {
					System.out.println(lineaTexto);
					lineaTexto = buffer.readLine();
				}
				// Cierro el buffer
				buffer.close();
				// Cierro el reader
				reader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("El archivo no existe");
		}
	}
}
