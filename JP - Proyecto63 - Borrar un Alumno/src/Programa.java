import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
			
			Scanner entrada = new Scanner(System.in);

			System.out.println("Ingrese su correo:");
			String correo = entrada.nextLine();
			System.out.println("Ingrese su clave:");
			String clave = entrada.nextLine();
	
			String comandoConteo = "SELECT COUNT(*) FROM alumnos WHERE correo = '" + correo + "' AND clave = '" +  clave + "'" ;
			System.out.println("El comando a ejecutarse es:" + comandoConteo);
			Statement comandoSQL = conexion.createStatement();
			
			ResultSet resultadoConteo = comandoSQL.executeQuery(comandoConteo);
			boolean idExiste = false;
			while( resultadoConteo.next() ) {
				int conteo = resultadoConteo.getInt(1);
				idExiste = conteo > 0;
			}
			
			if(idExiste) {
				System.out.println("Bienvenido al sistema");				
			} else {
				System.out.println("Credenciales erróneas");
			}
			
			System.out.println("Fin");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Me desconecté de la base de datos.");
	}
}