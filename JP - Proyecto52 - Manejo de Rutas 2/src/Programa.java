import java.nio.file.Path;
import java.nio.file.Paths;

public class Programa {

	public static void main(String[] args) {
		// Unir 2 rutas: Caso 1: Absoluta y Relativa
		Path ruta1Abs = Paths.get("C:\\users\\samantha");
		Path ruta1Rel = Paths.get("documentos\\curriculum.pdf");
		// Necesito formar 1 sola ruta que llegue a curriculum.pdf
		Path ruta1Uni = ruta1Abs.resolve(ruta1Rel);
		System.out.println(ruta1Abs);
		System.out.println(ruta1Rel);
		System.out.println(ruta1Uni);

		// Unir 2 rutas: Caso 2: Absoluta y Absoluta: Cuando una de ellas es parte de la otra
		Path ruta2Abs = Paths.get("C:\\users\\luis");
		Path ruta3Abs = Paths.get("C:\\users\\samantha\\documentos\\curriculum.pdf");
		// Necesito formar 1 sola ruta que llegue a curriculum.pdf
		Path ruta2Uni = ruta2Abs.resolve(ruta3Abs);
		System.out.println(ruta2Abs);
		System.out.println(ruta3Abs);
		System.out.println(ruta2Uni);

		// Unir 2 rutas: Caso 2: Relativa y Relativa
		Path ruta4Rel = Paths.get("users\\luis");
		Path ruta5Rel = Paths.get("users\\samantha\\documentos\\curriculum.pdf");
		// Necesito formar 1 sola ruta que llegue a curriculum.pdf
		Path ruta4Uni = ruta4Rel.resolve(ruta5Rel);
		System.out.println(ruta4Rel);
		System.out.println(ruta5Rel);
		System.out.println(ruta4Uni);

	
	}
}