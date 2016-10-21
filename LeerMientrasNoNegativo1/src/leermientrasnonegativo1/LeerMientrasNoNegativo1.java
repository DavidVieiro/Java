/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leermientrasnonegativo1;
import java.util.Scanner;
/**
 *
 * @author dam132
 */
public class LeerMientrasNoNegativo1 {
    public static void main(String[] args) {
        
        int x = 0;
        int n = 0;
        
        do {
            // introducir el Scanner
            Scanner reader = new Scanner(System.in);
            
            System.out.println("Introduce un numero entero:");
            n = reader.nextInt();
            
            if ( n > 0 ) {
                x = ++x;
            }
            
            
        } while ( n > 0);
        
        System.out.println("Se han procesado " + x + " numeros.");
    }
    
}
