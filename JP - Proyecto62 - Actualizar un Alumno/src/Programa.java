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
			System.out.println("Ingrese el id del estudiante a modificar:");
			int id = entrada.nextInt();
			String comandoConteo = "SELECT COUNT(*) FROM alumnos WHERE id = ?";
			PreparedStatement comandoSQL = conexion.prepareStatement(comandoConteo);
			comandoSQL.setInt(1, id);
			ResultSet resultadoConteo = comandoSQL.executeQuery();
			boolean idExiste = false;
			while( resultadoConteo.next()) {
				int conteo = resultadoConteo.getInt(1);
				idExiste = conteo > 0;
			}
			if(idExiste) {
				System.out.println("Ingrese el nuevo nombre del estudiante:");
				entrada = new Scanner(System.in);
				String nuevoNombre = entrada.nextLine();			
				System.out.println("Ingrese el nuevo correo del estudiante:");
				String nuevoCorreo = entrada.nextLine();
				System.out.println("Ingrese la nueva clave del estudiante:");
				String nuevaClave = entrada.nextLine();
				// Fabricamos un comando para actualizar un registro
				//                                                                                    1               2              3                      4
				String comando = "UPDATE alumnos SET nombre = ?, correo = ?, clave = ? WHERE id = ?";
				comandoSQL = conexion.prepareStatement(comando);
				// Rellenamos los ? con sus respectivos valores:
				comandoSQL.setString(1, nuevoNombre);
				comandoSQL.setString(2,  nuevoCorreo);
				comandoSQL.setString(3,  nuevaClave);
				comandoSQL.setInt(4, id);
				// Ejecutamos el comando
				boolean tuvoExito = comandoSQL.execute();
				System.out.println("Se actualizó el registro");				
			} else {
				System.out.println("No se encontró el id: "+ id);
			}
			
			
			System.out.println("Fin");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Me desconecté de la base de datos.");
	}
}