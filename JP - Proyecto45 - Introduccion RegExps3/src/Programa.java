import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programa {
    public static void main(String[] args) {
        final String regex = "^[_0-9a-zA-Z.-]+@[A-Za-z-]+(.[a-z]{2,})+$";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su correo:");
        final String string = entrada.nextLine();
        // Creando un objeto Pattern a partir de la regex en la cadena
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        // Creando un motor de analisis a partir del patron y la cadena a analizar
        final Matcher matcher = pattern.matcher(string);
        // Si se encontró una coincidencia
        if(matcher.find()) {
        	System.out.println("Se encontró coincidencia");
        } else {
        	System.out.println("No se encontró coincidencia");        	
        }        
    }
}
