package basicjava;

/* Identificar la presencia de una direcci�n de correo electr�nico
 * en un texto.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

    public static void main(String[] args) {
        String texto = "Esta es una frase con un correo electr�nico: info@example.com";
    	
        // Creamos una expresi�n regular que coincide con una direcci�n de correo electr�nico
        Pattern patron = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]+");

        // Creamos un objeto Matcher para buscar coincidencias en el texto
        Matcher matcher = patron.matcher(texto);

        // Recorremos todas las coincidencias
        while (matcher.find()) {
            // Imprimimos la coincidencia
            System.out.println(matcher.group());
        }
    }
}