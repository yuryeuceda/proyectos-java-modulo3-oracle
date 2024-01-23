import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		Vagon<String> a = new Vagon();
		a.contenido = "Lácteos";
		
		Vagon<Integer> b = new Vagon();
		b.contenido = 23;
		
		Vagon<Boolean> c = new Vagon();
		c.contenido = false;
		
		// Interconecto los vagones para formar un trencito
		a.eslabon = b;
		/*
		 *    ---------- a --------   ---------- b -----------             
		 *   contenido   eslabon      contenido   eslabon
		 * [  Lácteos   ] ---------> [       23       ] --------->
		 */
		b.eslabon = c;
		/*
		 *    ---------- b --------   ---------- c -----------             
		 *   contenido   eslabon      contenido   eslabon
		 * [       23       ] ---------> [      false     ] --------->
		 */
		
		/*        a                      b                  c
		 * [ Lácteos ] -----> [ 23 ] ----> [ false ] ----> NULL
		 */

	}

}
