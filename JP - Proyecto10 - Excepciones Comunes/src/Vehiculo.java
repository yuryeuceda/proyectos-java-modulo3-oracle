
public class Vehiculo implements AutoCloseable {

	@Override public void close() throws Exception {
		System.out.println("Me estoy cerrando...");
	}
}
