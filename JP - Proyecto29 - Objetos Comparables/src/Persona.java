public class Persona implements Comparable<Persona> {
	public String nombres;
	public int edad;
	public double estatura;
	public Persona(String nombre, int edad, double estatura) {
		this.nombres = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	// Tarea: Hacer que la comparación se base en 2 métrica
	//	Por edad y luego por estatura
	@Override public int compareTo(Persona otra) {
		// ¿Qué criterio utilizo para decidir la comparación?
		//int comparacion = this.edad - otra.edad;
		int comparacion = (int) ((this.estatura - otra.estatura) * 100);
		return comparacion;
	}
	
	@Override public String toString() {
		return this.nombres + "(" + this.estatura + ")";
	}
}