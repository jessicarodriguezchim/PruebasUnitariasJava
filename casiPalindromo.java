package com.generation.math;

import java.util.Scanner;
//clase principal
public class casiPalindromo {
	// Método principal donde comienza la ejecución del programa
	public static void main(String[] args) {
		// Crear un objeto Scanner para la entrada del usuario
		Scanner s = new Scanner(System.in);
		String palabra;
		
		//Bucle infinito
		while (true) {
			System.out.println("Ingrese la palabra");
			// Leer una palabra desde la entrada del usuario
			palabra = s.nextLine();
			// Llamar al método esCasiPalindromo y mostrar el resultado 
			System.out.println(esCasiPalindromo(palabra));
		}
	}

	// Método para verificar si una palabra es casi un palíndromo
	public static boolean esCasiPalindromo(String palabra) {
		// Declara un arreglo de caracteres para almacenar la palabra
		char[] casiPalindromo; 
		palabra = palabra.toLowerCase();// mayusculas y minusculas
		palabra = palabra.replace(" ", ""); //elimina espacios en blanco de la palabra.
		casiPalindromo = palabra.toCharArray(); //convierte la palabra en un arreglo de caracteres
		int izquierdo = 0;
		int derecho = casiPalindromo.length - 1;
		int cambios = 0;

		//recorre la palabra en ambos extremos.
		while (izquierdo < derecho) {
			// Si los caracteres en los extremos coinciden, avance hacia adentro sin hacer cambios
			if (casiPalindromo[izquierdo] == casiPalindromo[derecho]) {
				derecho--;
				izquierdo++;
			} 
			// Si los caracteres no coinciden, registre un cambio, luego avance hacia adentro
			else {
				cambios++;
				derecho--;
				izquierdo++;
			}

		}
		// Después de recorrer toda la palabra, si se hizo exactamente un cambio, la palabra es casi un palíndromo
		if (cambios == 1) {
			return true;
		} else {
			return false;
		}
	}

}
