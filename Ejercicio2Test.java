package com.generation.math.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.generation.math.Ejercicio2;
import com.generation.math.MathOperation;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio2Test {

	    @Test
	    public void isNumber() {
	        String resultado = Ejercicio2.dato("12 street" );
	        assertEquals( "Number", resultado );
	    }

	    @Test
	    public void isMayus() {
	    	String resultado = Ejercicio2.dato( "Hola");
	        assertEquals( "Mayus", resultado );
	    }
	    	@Test
		    public void isMinus() {
	    		String resultado = Ejercicio2.dato(  "crayoli");
		        assertEquals( "Minus", resultado );
		    }

		    @Test
		    public void isOther() {
		    	String resultado = Ejercicio2.dato(  "#ch30");
		        assertEquals( "Other", resultado );
	    }
	

}
