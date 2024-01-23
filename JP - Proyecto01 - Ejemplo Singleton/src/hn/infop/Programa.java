package hn.infop;

public class Programa {
	public static void main(String[] args) {
		// Vamos a intentar crear una instancia de Singleton con new
		// Singleton s1 = new Singleton();
		Singleton s1 = Singleton.obtenerInstancia();
		Singleton s2 = Singleton.obtenerInstancia();
		
		if(s1 == s2) {
			System.out.println("s1 y s2 controlan la misma instancia");
		} else {
			System.out.println("s1 y s2 controlan diferentes instancias");
		}
		
		MiPais pais1 = new MiPais();
		MiPais pais2 = new MiPais();
		
		if(pais1 == pais2) {
			System.out.println("pais1 y pais2 controlan la misma instancia");
		} else {
			System.out.println("pais1 y pais2 controlan la misma instancia");
		}
		// Comparamos los valores
		System.out.println("pais1.nombre = " + pais1.getNombre());
		System.out.println("pais2.nombre = " + pais2.getNombre());
		
		System.out.println("pais1.capital = " + pais1.getCapital());
		System.out.println("pais2.capital = " + pais2.getCapital());
		
	}
}