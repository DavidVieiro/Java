/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos1;
// mostrar todos los numeros divisibles por 3
// que esten entre dos numeros que se introduzen por teclado.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class Multiplos1 {
    public static void main(String[] args) throws IOException {
         
        // variables
        int numero1, numero2, i, mayor, menor;
        
        // introducir StreamReader
        InputStreamReader datos = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(datos);
        // introducir numeros
        System.out.println("Introduce el numero entero desde donde empieza:");
        numero1 = Integer.parseInt(reader.readLine());
        
        System.out.println("Introduce el numero entero donde se termina:");
        numero2 = Integer.parseInt(reader.readLine());
        
        if ( numero1 != numero2 ) {
            mayor = Math.max(numero1, numero2);
            menor = Math.min(numero1, numero2);

            for ( i = menor; i <= mayor ; ++i ) {

                 if ( i % 3 == 0 ) {
                     System.out.println( i + " - Es multiplo de 3");
                 }

            }
        }
        else {
            System.out.println("Introduce dos numeros diferentes...");
        }
        
        
    }
    
}
