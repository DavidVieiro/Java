/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayor1;

import java.util.Scanner;
// Crea un algoritmo que lea 20 numeros enteros e indique cual es el mayor de los numeros introducidos
// b) Cualquier valor
/**
 *
 * @author dam132
 */
public class NumeroMayor1 {
    public static void main(String[] args) {
        
        final int ENTEROS = 20;
        int i = 1;
        int numero;
        int numMayor;
        
        // introducir el Scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce un numero entero:");
        numero = reader.nextInt();
        
        numMayor = numero;
        
        do {
            System.out.println("Introduce un numero entero:");
            numero = reader.nextInt();
            
            if ( numero > numMayor ) {
                numMayor = numero;
            }
            ++i;
        } while ( i < ENTEROS);
        
        System.out.println("El numero mayor es " + numMayor);
    }
    
}
