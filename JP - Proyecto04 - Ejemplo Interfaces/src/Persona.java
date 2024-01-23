
public class Persona implements Comparable {
	public String identidad;
	public String nombre;
	@Override public boolean esIgualA(Object otro) {
		Persona otra = (Persona) otro;
		boolean mismoNombre = this.nombre.equals(otra.nombre);
		boolean mismaIdentidad = this.identidad.equals(otra.identidad);
		boolean sonLaMismaPersona = mismoNombre && mismaIdentidad;
		return sonLaMismaPersona;
	}
}
