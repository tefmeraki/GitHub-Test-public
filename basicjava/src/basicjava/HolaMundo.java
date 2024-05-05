package basicjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* El programa imprime un mensaje 10 veces:
 * - Iteraciones impares: "Hola mundo"
 * - Iteraciones pares: "Adiós mundo"
 */

public class HolaMundo {

	public static void main(String[] args) {
		final String HOLA = "Hola Mundo";
		final String ADIOS = "Adiós Mundo";
		
		String imprime; 
		
		for (int i=1;i<=10;i++)
		{
			if (i%2 == 1)
				imprime = HOLA;
			else
				imprime = ADIOS;
			
			System.out.println (i + ": " + imprime);
		}
		
		int[] literales = new int[3];
		literales[0] = 1;
		literales[1] = 1;
		literales[2] = 1;
		System.out.println ("*** Antes de llamar a la función");
		muestraArray(literales);
		System.out.println ("*** Después de llamar a la función");
		modificaArray (literales);
		muestraArray (literales);
		
		int numero = 10;
		System.out.println ("*** Antes de llamar a la función" + numero);
		modificaNumero (numero);
		System.out.println ("*** Antes de llamar a la función" + numero);
		
		 List<String> c = Arrays.asList("Hello", "World", "!");
	     List<String> d = new ArrayList(List.of("Hello", "World", "!"));
	     
	     hazCambios(c, d);
	     System.out.println ("c: " + c);
	     System.out.println ("d: " + d);
	     
	     System.out.println ("***********");
	}
	
	private static void hazCambios (List<String> c, List<String> d) {
		c = List.of("Cambio", "desde", "función");
		d.add("Nuevo");
	}
	
	private static void modificaArray (int[] literales)
	{
		literales[2] = 100;
		literales = new int[]{20, 30, 50};
	}
	
	private static void muestraArray (int[] literales)
	{
		for (int numero : literales)
			System.out.println ("*** " + numero);
	}
	
	private static void modificaNumero (int numero)
	{
		numero++;
	}
}
