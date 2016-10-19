/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cualificacion;

import java.util.Scanner;

/**
 *
 * @author dam132
 */
public class Cualificacion {
    public static void main(String[] args) {
               
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Introduce una nota (0 - 10): ");
        int nota = reader.nextInt(); // Scans the next token of the input as an int.
        
        if ( nota >= 0 && nota < 5) {
            System.out.println("Suspenso");
        }
        else if ( nota == 5 ) {
            System.out.println("Aprobado");
        }
        else if ( nota == 6 ){
            System.out.println("Bien");
        }
        else if ( nota == 7 || nota == 8 ){
            System.out.println("Notable");
        }
        else if ( nota == 9 || nota == 10 ){
            System.out.println("Sobresaliente");
        }
        else {
            System.out.println("Nota incorrecta, introduce una nota de 0 a 10");
        }
            
    }
    
}
