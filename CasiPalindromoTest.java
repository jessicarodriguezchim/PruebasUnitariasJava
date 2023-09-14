package com.generation.math.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.generation.math.MathOperation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.generation.math.casiPalindromo;

public class CasiPalindromoTest {

	@Test
	@DisplayName("valida si una palabra es casi palindromo")
	 public void esCasiPalindromoTest() {
		//una prueba que arroje true
		boolean resultado = casiPalindromo.esCasiPalindromo("Ocho");
		assertEquals( true, resultado );
		
		resultado = casiPalindromo.esCasiPalindromo("Ver");
		assertEquals( true, resultado );
		
		resultado = casiPalindromo.esCasiPalindromo("Anita lavo la tina");
		assertEquals( true, resultado );
		
		
	
	}
		@Test 
		public void esCasiPalindromoFalseTest() {
		//una prueba que arroje false
			boolean resultado = casiPalindromo.esCasiPalindromo("Veronica");
			assertEquals( false, resultado );
			
			resultado = casiPalindromo.esCasiPalindromo("Oso");
			assertEquals( false, resultado );
			
			resultado = casiPalindromo.esCasiPalindromo("Hola");
			assertEquals( false, resultado );
		}
}
