/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leernotascorrectas2;

import java.util.Scanner;

/**
 *
 * @author dam132
 */
// Leer notas correctas y mostrar la media. Solo numeros del 1 al 10. for
public class LeerNotasCorrectas2 {
    public static void main(String[] args) {
        // introducir el Scanner
        Scanner reader = new Scanner(System.in);
        
        int media = 0;
        int nota;
        
        System.out.println("Se van a introducir 10 notas.");
        
        for ( int i = 1; i <= 10; ++i ) {
            // introducir la nota
            System.out.println("Introduce una nota ( 1 - 10 ):");
            nota = reader.nextInt();
            
            if ( nota >= 1 && nota <= 10 ) {
                media += nota;
            }
            else {
                System.out.println("Nota no valida.");
            }
        }
        media /= 10;
        System.out.println("La media es " + media);
    }
    
}
