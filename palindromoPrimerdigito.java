package generation.pruebas;

public class palindromoPrimerdigito {
	
	String casipalindromo(String palabra){
		
		palabra = palabra.toUpperCase();
		palabra = palabra.trim();
		int cont = 0;
		int pos = 0;
		char letra = 0;
		
		int mitad = (palabra.length())/2;
		
		for(int i = 0; i < mitad; i++ ){
			if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
			    letra = palabra.charAt(i);
			    pos = palabra.length() - i - 1;
			    cont += 1;
			}
		}
		
		if(cont == 0){
			return "FALSE";
		}
			if(cont > 1){
			return "FALSE";
		}
		

		String palabraRegreso = palabra.substring(0, pos) + letra + palabra.substring(pos + 1);
		return palabraRegreso;
		
	}
	
	String primerDigito(String palabra){
		
		char c = palabra.charAt(0);
		int tipo = Character.getType(c);

		switch (tipo) {
		    case Character.UPPERCASE_LETTER:
				return "EL PRIMER CARACTER ES MAYUSCULA";

		    case Character.LOWERCASE_LETTER:
				return "EL PRIMER CARACTER ES MINUSCULA";

		    case Character.DECIMAL_DIGIT_NUMBER:
				return "EL PRIMER CARACTER ES NUMERO";

		    case Character.SPACE_SEPARATOR:
				return "EL PRIMER CARACTER ES ESPACIO";

		    default:
				return "EL PRIMER CARACTER ES ESPECIAL";

		}
	}
	
	
}
