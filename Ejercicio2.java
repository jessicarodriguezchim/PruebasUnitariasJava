package com.generation.math;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		while (true) {
		Scanner scanner = new Scanner(System.in);//entrada del programa
		System.out.println("Escriba la palabra: ");
		String palabra;
		palabra = scanner.nextLine();
		System.out.println(dato ( palabra));
		}
	}
		// Método para verificar si una palabra es casi un palíndromo
		public static String dato (String palabra) {
			// Declara un arreglo de caracteres para almacenar la palabra
			char[] dato; 
			dato = palabra.toCharArray(); //convierte la palabra en un arreglo de caracteres y lo almacena en dato.
		
			 // Comprueba si el primer carácter es un dígito
	        if (Character.isDigit(dato [0])) {
	            return "Number"; // Si es un dígito, devuelve "Number"
	        }

	        // Comprueba si el primer carácter es una letra en mayúscula
	        if (Character.isUpperCase(dato [0])) {
	            return "Mayus"; // Si es una letra en mayúscula, devuelve "Mayus"
	        }

	        // Comprueba si el primer carácter es una letra en minúscula
	        if (Character.isLowerCase(dato [0])) {
	            return "Minus"; // Si es una letra en minúscula, devuelve "Minus"
	        }

	        // Si no se encuentra en ninguna de las categorías anteriores, se considera "Other"
	        return "Other"; // Si no coincide con ninguna de las categorías anteriores, devuelve "Other"
	    }
}
			