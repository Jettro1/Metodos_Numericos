/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

/**
 *
 * @author fing.labcom
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Class_Acciones sumanumeros = new Class_Acciones();
        double s=101111;
        long z=27.025;
       long a= (42);
      long  b=(64);
        long c=145;
       char d=("c");
        char e=("abcd");
        
        System.out.println("Ejercicio 1"+ sumanumeros.BinarioADecimal(s));
       System.out.println("Ejercicio 2 "+ sumanumeros.convertirDecimalABinarioManual(z));
        System.out.println("Ejercicio 3"+ sumanumeros.octalADecimal(a);
        System.out.println("Ejercicio 4"+ sumanumeros.convertirDecimalABinarioManual(b));
       System.out.println("Ejercicio 5"+ sumanumeros.convertirDecimalABinarioManual(c));
        System.out.println("Ejercicio 6"+ sumanumeros.caracterHexadecimalADecimal(d));
      System.out.println("Ejercicio 7"+ sumanumeros.caracterHexadecimalADecimal(e);
   
    }  
}
