
public class Persona {
	private String nombre;
	// Constructores
	public Persona() {
	}
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	// Gets y Sets
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws Exception {
		//if(edad < 0) throw new Exception("<EXCEPCION> Edad negativa");
		if(edad < 0) throw new EdadErroneaException();
		this.edad = edad;
	}
}
