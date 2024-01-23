import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class Programa {
	// Clase interna
	private static class Alumno {
		public String nombre;
		public int nota1, nota2, nota3;
		public Alumno(String nombre, int n1, int n2, int n3) {
			this.nombre = nombre;
			this.nota1 = n1; 
			this.nota2 = n2;
			this.nota3 = n3;
		}
		@Override public String toString() {
			return this.nombre + ", " + this.nota1 + "," + this.nota2 + "," + this.nota3;
		}
	}
	public static void main(String[] args) {
		Alumno a1 = new Alumno("Juan Perez", 65, 78, 81);
		Alumno a2 = new Alumno("Luis Ramos", 83, 75, 62);
		Alumno a3 = new Alumno("Norma Lopez", 81, 78, 80);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		// Vamos a imprimir a un archivo
		String strArchivoCSV = "alumnos.csv";
		File archivo = new File(strArchivoCSV);
		try
		(
			// Recursos autocerrables : Version try con recursos	
			//FileWriter fWriter = new FileWriter(strArchivoCSV, Charset.forName("UTF-8"), false);
			//BufferedWriter bWriter = new BufferedWriter(fWriter);
			//PrintWriter pWriter = new PrintWriter(bWriter);
			PrintWriter pWriter = new PrintWriter(archivo);
		)
		{	
			pWriter.println(a1);
			pWriter.println(a2);
			pWriter.println(a3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
