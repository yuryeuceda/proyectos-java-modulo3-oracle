
public class Mascota implements Comparable {
	public String raza;
	public String nombre;
	@Override public boolean esIgualA(Object otro) {
		Mascota otra = (Mascota) otro;
		boolean mismoNombre = this.nombre.equals(otra.nombre);
		boolean mismaRaza = this.raza.equals(otra.raza);
		boolean sonLaMismaPersona = mismoNombre && mismaRaza;
		return false;
	}
}