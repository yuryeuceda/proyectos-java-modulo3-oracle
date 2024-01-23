public class Billete implements Comparable<Billete> {
	public String descripción;
	public int cantidad;
	
	public Billete(String descripción, int cantidad) {
		super();
		this.descripción = descripción;
		this.cantidad = cantidad;
	}

	@Override public int compareTo(Billete otro) {
		// Metrica para comparar los billetes
		return this.cantidad - otro.cantidad;
	}

	@Override public String toString() {
		return this.descripción;
	}
	
}
