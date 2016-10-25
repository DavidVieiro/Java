/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leernotascorrectas3;

import java.util.Scanner;

/**
 *
 * @author dam132
 */
// Leer notas correctas y mostrar la media. Solo numeros del 1 al 10. variable switch
public class LeerNotasCorrectas3 {
    public static void main(String[] args) {
        // definimos las variables.
        int correcta; // Variable switch
        int nota;
        float media;
        int suma = 0;
        int c;
        final byte CANTIDAD = 10; // esto es una constante por eso es todo en mayus.
        
        // introducir el Scanner
        Scanner reader = new Scanner(System.in);
        
        for ( c = 1; c <= CANTIDAD; c++) {
            
            do {
                correcta = 0; // Variable switch
                
                System.out.println("Introduzca la " + c + "ª nota ( Notas de 1 - 10 )");
                nota = reader.nextInt();
                
                if ( nota > 0 && nota < 11 ) {
                    correcta = 1;
                }
                else {
                    System.out.println("Nota introducida incorrecta.");
                }
                
            } while ( correcta == 0 );
            
            suma += nota;
        }
        media = (float) suma / CANTIDAD;
        System.out.println("La media es " + media);
    }
    
}
