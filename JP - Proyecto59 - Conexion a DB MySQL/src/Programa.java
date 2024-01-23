import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Programa {
	public static void main(String[] args) {
		System.out.println("Intentando conectarnos a la db");
		// Credenciales para ingresar a la DB
		String usuario = "programador2";
		String password = "123456789";
		String servidor = "localhost";
		String puerto = "3306";
		// Cadena de conexión
		String cadenaConexion = String.format("jdbc:mysql://%s:%s", servidor, puerto);
		System.out.println(cadenaConexion);
		// Tratamos de conectarnos, creando un objeto de conexión
		try (Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, password)) {
			// Si no hubieron excepciones, entonces se va imprimir el sig. mensaje
			System.out.println("Sapbeeeee, se conectó a la base de datos.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Me desconecté de la base de datos.");
	}
}