/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeros;

/**
 *
 * @author fing.labcom
 */
public class Class_Acciones {
    public static double BinarioADecimal(double num){
    //1. de BINARIO A DECIMAL
             do {
         
          //comprobamos que sea un número binario es decir
          //que este formado solo por ceros y unos
          esBinario = true;
          aux = S;
          while (aux != 0) {
                     digito = aux % 10; //última cifra del números
                     if (digito != 0 && digito != 1) { //si no es 0 ó 1
                          esBinario = false; //no es un número binario
                     }
                     aux = aux / 10; //quitamos la última cifra para repetir el proceso                           
           }
      } while (!esBinario); //se vuelve a pedir si no es binario
       double exponente = 0;
      double decimal = 0; //será el equivalente en base decimal
      while (numero != 0) {
                //se toma la última cifra
                double digito = numero % 10;
                //se multiplica por la potencia de 2 correspondiente y se suma al número                          
                decimal = decimal + digito * (int) Math.pow(2, exponente);
                //se aumenta el exponente
                exponente++;
                //se quita la última cifra para repetir el proceso
                numero = numero / 10;
      }
      return decimal;
    }
    public static String convertirDecimalABinarioManual(long decimal) {
	if (decimal <= 0) {
		return "0";
	}
	StringBuilder binario = new StringBuilder();
	while (decimal > 0) {
		short residuo = (short) (decimal % 2);
		decimal = decimal / 2;
		// Insertar el dígito al inicio de la cadena
		binario.insert(0, String.valueOf(residuo));
	}
	return binario.toString();
}
    public static long octalADecimal(String octal) {
    long decimal = 0;
    int potencia = 0;
    for (int x = octal.length() - 1; x >= 0; x--) {
        int valorActual = Character.getNumericValue(octal.charAt(x));
        long elevado = (long) Math.pow(8, potencia) * valorActual;
        decimal += elevado;
        potencia++;
    }
    return decimal;
}
    public static int caracterHexadecimalADecimal(char caracter) {
    switch (caracter) {
        case 'A':
            return 10;
        case 'B':
            return 11;
        case 'C':
            return 12;
        case 'D':
            return 13;
        case 'E':
            return 14;
        case 'F':
            return 15;
        default:
            return Integer.parseInt(String.valueOf(caracter));
    }
}

    
}
