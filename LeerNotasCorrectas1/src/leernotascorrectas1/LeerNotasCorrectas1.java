/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leernotascorrectas1;

import java.util.Scanner;

/**
 *
 * @author dam132
 */
// Leer notas correctas y mostrar la media. Solo numeros del 1 al 10.
public class LeerNotasCorrectas1 {
    public static void main(String[] args) {
        // introducir el Scanner
        Scanner reader = new Scanner(System.in);
        
        int i = 1;
        int media = 0;
        int nota;
        
        do {
            // introducir la nota
            System.out.println("Introduce un numero entero:");
            nota = reader.nextInt();
            if ( nota >= 1 && nota <= 10 ) {
                media += nota;
                ++i;
            }
            else {
                System.out.println("Nota no valida.");
            }
        } while ( i <= 10 );
        media /= 10;
        System.out.println("La media es " + media);
    }
    
}
