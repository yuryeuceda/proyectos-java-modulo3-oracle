import java.io.IOException;

public class Programa {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		char[] input;
		System.out.print("Enter a string: ");
		// Leo el texto letra por letra
		input = readEntry();
		// Copio el contenido del arreglo a tro arreglo
		for (int i = 0; i < input.length; i++) {
			if (input[i] != '\n' && input[i] != '\0')
				sb.append(input[i]);
			// endif
		} // end for
		// Imprimo lo leido letra por letra
		System.out.println(sb);
	}// end method main

	private static char [ ] readEntry() {
		try {
			int c;
			StringBuffer buffer = new StringBuffer();
			c = System.in.read();
			while (c != '\n' && c != -1) {
				buffer.append((char) c);
				c = System.in.read();
			} // endwhile
			return buffer.toString().trim().toCharArray();
		} // end try
		catch (IOException e) {
			return null;
		} // endcatch
	}// end method readEntry
}
