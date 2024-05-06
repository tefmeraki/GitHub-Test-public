package edu.medac.git;
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
		
		System.out.println(">>> FIN de la ejecución.");
	}
}
