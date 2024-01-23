import java.util.ArrayList;
import java.util.Arrays;

public class StringBuilder {
	ArrayList< Character [ ]  > arreglo = new ArrayList< Character [ ] >();
	Character [] bufferActual;
	int posicionDentroBuffer;
	public StringBuilder() {
		Character [ ] bufferInicial = new Character[256];
		arreglo.add(bufferInicial);
		bufferActual = bufferInicial;
		posicionDentroBuffer = 0;
	}
	
	public void append(char letra) {
		if(posicionDentroBuffer < bufferActual.length) {
			bufferActual[posicionDentroBuffer++] = letra;
		} else {
			posicionDentroBuffer = 0;
			bufferActual = new Character[256];
			bufferActual[posicionDentroBuffer++] = letra;
			arreglo.add(bufferActual);
		}
	}

	@Override public String toString() {
		String resultado = "";
		for(Character [ ] buffer : arreglo) {
			resultado += Arrays.toString(buffer);
			resultado += "\n";
		}
		return resultado;
	}
	
	
}
