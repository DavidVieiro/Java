/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo1;

import java.util.Scanner;

/**
 *
 * @author dam132
 */
public class NumeroPrimo1 {
    public static void main(String[] args) {
        // introducir el Scanner
        Scanner reader = new Scanner(System.in);
        // introducir el entero
        System.out.println("Introduce un numero entero:");
        int numero = reader.nextInt();
        // inicializamos la variable
        // for (ejecutado_primera_vez;condicion;incremento) { }
        if ( numero == 1 ) {
            System.out.println("El numero no es primo");
        }
        else {
            for ( int c = 2; numero >= 1; numero -= 1 ) {
                // introducir el entero
                System.out.println("Introduce un numero entero:");
                numero = reader.nextInt();
                if ( numero % c == 0 ){
                    System.out.println("El numero " + numero + " ES primo");
                }
                else {
                    System.out.println("El numero " + numero + " NO ES primo");
                }
                
            }
        }
        
    }
}
