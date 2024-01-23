import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		System.out.println("Intentando conectarnos a la db");
		// Credenciales para ingresar a la DB
		String usuario = "programador2";
		String password = "123456789";
		String servidor = "localhost";
		String puerto = "3306";
		String baseDeDatos = "sistema_alumnos";
		// Cadena de conexión
		String cadenaConexion = String.format("jdbc:mysql://%s:%s/%s", servidor, puerto, baseDeDatos);
		System.out.println(cadenaConexion);
		// Tratamos de conectarnos, creando un objeto de conexión
		try (Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, password)) {
			// Si no hubieron excepciones, entonces se va imprimir el sig. mensaje
			System.out.println("Sapbeeeee, se conectó a la base de datos.");
			
			while(true) {
				Scanner entrada = new Scanner(System.in);
				// Pedimos la informacion de un alumno
				System.out.println("Ingrese el nombre del alumno:");
				String nombre = entrada.nextLine();
				System.out.println("Ingrese el correo del alumno:");
				String correo = entrada.nextLine();
				System.out.println("Ingrese el password del alumno");
				String clave = entrada.nextLine();
				// Vamos a insertar la informacion en la tabla alumnos
				try {
					// 1.-Creamos un objeto de tipo Statement a partir del objeto Connection
					Statement instruccion = conexion.createStatement();
					// 2.- Pedimos al objeto de tipo Statement que ejecute un query
					String comando = "INSERT INTO alumnos( nombre, correo, clave) VALUES( '" + nombre + "','"+ correo + "','"  + clave + "')";
					System.out.println("Ejecutando el comando: " + comando);
					instruccion.execute(comando);					
				} catch (SQLException excepcion) {
					System.out.println("<ERROR> No se pudo insertar la información en la base de datos");
					excepcion.printStackTrace();
				}
				System.out.println("Desea agregar mas registros S/N");
				String continuar = entrada.next().toUpperCase();
				if(continuar.equals("N")) break;
			}
			
			System.out.println("Fin");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Me desconecté de la base de datos.");
	}
}