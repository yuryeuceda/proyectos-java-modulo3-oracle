import java.util.HashSet;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
		// Usamos un conjunto para agregar los departamentos de Honduras
		HashSet<String> departamentos = new HashSet<String>();
		// Agrego algunos departamentos
		departamentos.add("Francisco Morazán");
		departamentos.add("Choluteca");
		departamentos.add("El Paraízo");
		departamentos.add("Cortés");
		departamentos.add("Santa Barbara");
		System.out.println(departamentos);
		// Qué pasa si intento ingresar Cortés de nuevo
		departamentos.add("Cortés");
		System.out.println("Después de tratar de ingresar Cortés por segunda vez");
		System.out.println(departamentos);
		
		// Verifico si el departamento Comayagua está agregado
		boolean yaEstaComayagua = departamentos.contains("Comayagua");
		if(yaEstaComayagua == false) departamentos.add("Comayagua");
		System.out.println("Después de tratar de ingresar Comayagua");
		System.out.println(departamentos);
	}
}