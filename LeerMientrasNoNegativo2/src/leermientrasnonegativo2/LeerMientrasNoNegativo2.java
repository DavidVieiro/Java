/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leermientrasnonegativo2;

import java.util.Scanner;

/**
 *
 * @author dam132
 */
/*
 * Leer numeros mientras no se lea un valor negativo.
 * Indicar cuantos numeros se procesan
 * Usando SWITCH
 */
public class LeerMientrasNoNegativo2 {
    public static void main(String[] args) {
        
        // switch
        int sw = 0;
        int x = 0;
        int n;
        
        do {
            // introducir el Scanner
            Scanner reader = new Scanner(System.in);
            // introducir el entero
            System.out.println("Introduce un numero entero:");
            n = reader.nextInt();
            // si el entero es positivo, sumarle 1 a x (autoincremento)
            if ( n >= 0 ) {
                ++x;
            }
            else {
                sw = 1;
            }
        } while (sw == 0);
        // mostrar el numero de numeros procesados
        System.out.println("Se han procesado " + x + " numeros.");
        if ( sw == 1) {
            System.out.println("Se ha leido un numero negativo.");
        }
        
        
    }
    
}
