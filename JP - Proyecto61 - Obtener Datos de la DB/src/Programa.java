import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
			
				// Vamos a obtener la informacion en la tabla alumnos
				try {
					// 1.-Creamos un objeto de tipo Statement a partir del objeto Connection
					Statement instruccion = conexion.createStatement();
					// 2.- Pedimos al objeto de tipo Statement que ejecute un query
					String comando = "SELECT id, nombre, correo FROM alumnos;";
					System.out.println("Ejecutando el comando: " + comando);
					ResultSet resultadoConsulta = instruccion.executeQuery(comando);
					// 3- Obtener la data fila por fila
					System.out.println("+----------+----------------------+-----------------------------+");
					System.out.println("|    Id    |   Nombre             |   Correo                    |");
					System.out.println("+----------+----------------------+-----------------------------+");
					int numAlumnos = 0;
					while( resultadoConsulta.next() ) {
						int id = resultadoConsulta.getInt("id");
						String nombre = resultadoConsulta.getString("nombre");
						String correo = resultadoConsulta.getString("correo");
						String filaResultado = String.format("| %08d |\t %16s |\t %16s \t|", id, nombre, correo);
						System.out.println(filaResultado);
						numAlumnos++;
					}
					System.out.println("+----------+----------------------+-----------------------------+");
					System.out.println("Total de alumnos en la BD: " + numAlumnos);
				} catch (SQLException excepcion) {
					System.out.println("<ERROR> No se pudo insertar la información en la base de datos");
					excepcion.printStackTrace();
				}
			
			System.out.println("Fin");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Me desconecté de la base de datos.");
	}
}