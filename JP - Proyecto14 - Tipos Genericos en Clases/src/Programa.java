
public class Programa {

	public static void main(String[] args) {
		Vagon a = new Vagon();
		a.contenido = "Maíz";
		/*
		a.contenido = 100;
		a.contenido = false;
		a.contenido = 0.25;
		*/
		
		Vagon b = new Vagon();
		b.contenido = 23;
		
		Vagon c = new Vagon();
		c.contenido = false;
		
		// Si trato de concatenar el contenido del vagon a
		String frase = "Arroz y " + a.contenido;
		System.out.println(frase);
		
		// Si trato de sumar el contenido de vagon b
		int numero = (int) b.contenido + 5;
		
	}

}
