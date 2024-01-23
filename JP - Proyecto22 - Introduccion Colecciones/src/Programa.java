public class Programa {
	public static void main(String[] args) {
		Vagon A = new Vagon();
		A.contenido = "Arroz";
		A.eslabon = null;
		
		A.eslabon = new Vagon();
		A.eslabon.contenido = "Maiz";
		
		A.eslabon.eslabon = new Vagon();
		A.eslabon.eslabon.contenido = "Harina";
		
		A.eslabon.eslabon.eslabon = new Vagon();
		A.eslabon.eslabon.eslabon.contenido = "Azucar";

		// Recorrer o iterar esta estructura de datos
		Vagon iterador = A;
		while(iterador != null) {
			// Obtengo el contenido del Vagon actual al que apunta iterador
			String contenido = iterador.contenido;
			// Hago que iterador avance al siguiente Vagon
			iterador = iterador.eslabon;
			// Imprimo el contenido
			System.out.print("(" + contenido + ")--->");
		}
		
		// Calculo del tamaño del trencito
		int tamaño = 0;
		while(iterador != null) {
			tamaño++;
			iterador = iterador.eslabon;
		}
		
		
		
	}
}