import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		try ( Scanner entrada = new Scanner(System.in) ; Vehiculo carro = new Vehiculo() ) {
			System.out.println("<Inicio del Try>");
			// Creamos un scanner
			//Scanner entrada = new Scanner(System.in);
			// Pedimos información
			System.out.println("Deme su nombre:");
			String nombre = entrada.next();
			System.out.println("Deme su fecha de nacimiento(DD/MM/YYYY):");
			String fechaNacimiento = entrada.next();
			System.out.println("Deme su estatura(mts)");
			double estatura = entrada.nextDouble();
			// Calculamos la edad
			// Paso 1: Separamos la fechaNacimiento en 3 partes usando el método split
			String [ ] partesFechaNacimiento = fechaNacimiento.split("/");
			// Tengo las partes de la fecha pero en cadenas:
			String strDia = partesFechaNacimiento[0];
			String strMes = partesFechaNacimiento[1];
			String strAño = partesFechaNacimiento[2];
			// Convierto strAño a entero
			int añoNacimiento = Integer.parseInt(strAño);
			// Con esto ya puedo calcular la edad
			int edad = 2023 - añoNacimiento;
			System.out.println("La edad es "+edad);
			// Cierro el scanner
			// entrada.close();
			// Pido algo del scanner
			System.out.println("Cual es su sexo(biológico):");
			char sexo = entrada.next().charAt(0);
			// Vamos a crear una variable que formatee la informacion
			String informacion = "{ \"nombre\":\"%s\", \"fechaNacimiento\":\"%s\", \"sexo\":\"%s\" }";
			String jsonData = String.format(informacion, nombre, fechaNacimiento, sexo);
			System.out.println(jsonData);
			// Guardo la data en un archivo
			String nombreArchivo = "C:\\" + nombre + ".json";
			Files.write(Paths.get(nombreArchivo), jsonData.getBytes());			
			//entrada.close();
			System.out.println("<Fin del Try>");
		} catch(java.io.IOException ex) {
			System.out.println("<EXCEPCION> Ocurrió un error en el manejo de archivos");
		} catch(IllegalStateException ex) {
			System.out.println("<EXCEPCION> Es clavo del programador. Despidalo y consigase otro");
		} catch(ArrayIndexOutOfBoundsException  |  NumberFormatException ex) { 	
			System.out.println("<EXCEPCION> Ingresó la fecha de forma incorrecta");
		} catch(InputMismatchException ex) {
			System.out.println("<EXCEPCION> Cabezón, ingresaste un valor no numérico en un campo numérico");
		} catch(Exception ex) {
			System.out.println("<EXCEPCION> Ocurrió un error inesperado");
			ex.printStackTrace();
		} finally {
			try {
				String contenido = null;
				System.out.println("La longitud del contenido del archivo es:" + contenido.length());
			} catch(NullPointerException ex) {
				System.out.println("<EXCEPCION> El contenido del archivo esta vacío");
			}
		}
		
		System.out.println("<FIN> El programa terminó exitosamente");
	}
}