import java.util.ArrayList;
import java.util.Collections;

public class Programa {
	public static void main(String[] args) {
		// Los billetes usados en honduras
		Billete uno = new Billete("Un Lempira", 1);
		Billete dos = new Billete("Dos Lempiras", 2);
		Billete cinco = new Billete("Cinco Lempiras", 5);
		Billete diez = new Billete("Diez Lempiras", 10);
		Billete veinte = new Billete("Veinte Lempiras", 20);
		Billete cincuenta = new Billete("Cincuenta Lempiras", 50);
		Billete cien = new Billete("Cien Lempiras", 100);
		Billete docientos = new Billete("Docientos Lempiras", 200);
		Billete quinientos = new Billete("Quinientos Lempiras", 500);
		// Creamos un ArrayList y los agregamos
		ArrayList<Billete> lstBilletes = new ArrayList<Billete>();
		lstBilletes.add(quinientos);
		lstBilletes.add(uno);
		lstBilletes.add(docientos);
		lstBilletes.add(veinte);
		lstBilletes.add(cinco);
		lstBilletes.add(cincuenta);
		lstBilletes.add(dos);
		lstBilletes.add(cien);
		lstBilletes.add(diez);
		System.out.println("Antes de ordenar:" + lstBilletes);
		// Ordenamos la lista
		Collections.sort(lstBilletes);
		System.out.println("Despues de ordenar:" + lstBilletes);
	}
}