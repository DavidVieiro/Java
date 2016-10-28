/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayorpositivos1;

import java.util.Scanner;
// Crea un algoritmo que lea 20 numeros enteros e indique cual es el mayor de los numeros introducidos
// a) Suponemos solo positivos
/**
 *
 * @author dam132
 */
public class NumeroMayorPositivos1 {
    public static void main(String[] args) {
        
        final int ENTEROS = 20; // constante para limitar la cantidad de numeros que se introducen.
        int i = 1;
        int numero;
        // se puede usar Integer.MIN_VALUE; en vez de definir la variable
        int numMayor = 0;
        
        // introducir el Scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo:");
        numero = reader.nextInt();
        if (numero > 0) {
            numMayor = numero;
        }
        
        do {
            System.out.println("Introduce un numero entero positivo:");
            numero = reader.nextInt();
            if ( numero > 0 ) {
                if ( numero > numMayor ) {
                    numMayor = numero;
                } 
            }
            ++i;
        } while ( i < ENTEROS);
        
        System.out.println("El numero mayor es " + numMayor);
        if ( numMayor == 0 && i == ENTEROS ) {
            System.out.println("Es posible que todos los numeros introducidos sean negativos.");
        }
    }
    
}
