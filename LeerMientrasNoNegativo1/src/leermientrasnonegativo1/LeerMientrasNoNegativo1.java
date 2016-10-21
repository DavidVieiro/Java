/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leermientrasnonegativo1;
import java.util.Scanner;
/**
 *
 * @author dam132
 */
/*
 * Leer numeros mientras no se lea un valor negativo.
 * Indicar cuantos numeros se procesan
 */
public class LeerMientrasNoNegativo1 {
    public static void main(String[] args) {
        
        int x = 0;
        int n;
        
        do {
            // introducir el Scanner
            Scanner reader = new Scanner(System.in);
            // introducir el entero
            System.out.println("Introduce un numero entero:");
            n = reader.nextInt();
            // si el entero es positivo, sumarle 1 al autoincremento
            if ( n >= 0 ) {
                ++x;
            }
        } while ( n >= 0); // el punto y coma es importante
        // mostrar el numero de numeros procesados
        System.out.println("Se han procesado " + x + " numeros.");
    }
    
}
