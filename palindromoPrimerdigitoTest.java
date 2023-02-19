package generation.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class palindromoPrimerdigitoTest extends palindromoPrimerdigito {

    @Test
    public void testCasipalindromo() {
        assertEquals("FALSE", casipalindromo("Oso"));
        assertEquals("FALSE", casipalindromo("hola"));    	
        assertEquals("FALSE", casipalindromo("veronica"));
        assertEquals("ANNA", casipalindromo("ania"));
        assertEquals("CAROLINAANILORAC", casipalindromo("CAROLINAENILORAC"));
        assertEquals("ANITALAVALATINA", casipalindromo("ANITALAVOLATINA"));

    }

    @Test
    public void testPrimerDigito() {

        assertEquals("EL PRIMER CARACTER ES MAYUSCULA", primerDigito("Hola"));
        assertEquals("EL PRIMER CARACTER ES MINUSCULA", primerDigito("hola"));
        assertEquals("EL PRIMER CARACTER ES NUMERO", primerDigito("123"));
        assertEquals("EL PRIMER CARACTER ES ESPACIO", primerDigito(" hola"));
        assertEquals("EL PRIMER CARACTER ES ESPECIAL", primerDigito("?hola"));
    }

}
