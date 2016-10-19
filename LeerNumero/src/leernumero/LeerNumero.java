/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leernumero;

import java.util.Scanner;

/**
 *
 * @author dam132
 */
public class LeerNumero {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Introduce un numero: ");
        int numero = reader.nextInt(); // Scans the next token of the input as an int.
        
        if ( numero > 0) { //positivo
            System.out.println("El numero es positivo");
        }
        else if ( numero < 0 ) { // negativo
            System.out.println("El numero es negativo");
        }
        else if ( numero == 0 ) { // cero
            System.out.println("El numero es cero");
        }
        else {
            System.out.println("Introduce un numero entero");
        }
    }
    
}
