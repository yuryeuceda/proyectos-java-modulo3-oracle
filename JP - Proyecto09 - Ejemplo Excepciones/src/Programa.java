import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	// Tarea: Crear su propia Excepcion: EdadErroneaException
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.setNombre("Juan Perez");
		try {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Deme la edad de la persona");
			int edad = entrada.nextInt();
			persona1.setEdad(edad);
		} catch( InputMismatchException ex) {
			System.out.println( "<EXCEPCION> Ingresó un valor no numérico" );
		} catch( EdadErroneaException ex ) {
			System.out.println( ex.getMessage() );			
		} catch ( Exception ex ) {
			System.out.println( ex.getMessage() );
		}
		
		System.out.print( "La persona: " + persona1.getNombre() );
		System.out.println( " Tiene: " + persona1.getEdad() + " años" );

		System.out.println("<FIN> El programa terminó satisfactoriamente");
	}
}