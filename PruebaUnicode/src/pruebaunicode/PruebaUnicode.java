/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaunicode;
/**
 *
 * @author dam132
 */
public class PruebaUnicode {
    public static void main(String[] args) {
        // Definimos la variable
        char c = '€';
        
        System.out.println("letra -> " + (int)'A'); // Unicode 2 Bytes
        System.out.println("letras -> " + '\u0041' + " " + '\u00C1' + "\n"); // \n es un salto de linea
        
        System.out.println("euro -> " + (int)'€' + " " + c);
        System.out.println("euro -> " + '\u20AC' + " " + c);
        System.out.println("letras Ñ ñ -> " + (int)'Ñ' + " " + (int)'ñ' + "\n");
        
        System.out.println("secuencias escape -> " + "\"$\" " + "\\A\\");
        System.out.println("letra Ñ -> " + '\u00D1' + " " + '\u00F1');
    }
}
