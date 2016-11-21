/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package except1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class Except1 {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    public static void main(String[] args) throws IOException {
        
        String texto;
        int i , j;
        
        try {
            
            System.out.println("Numero");
            texto = teclado.readLine();
            i = Integer.valueOf(texto);
            System.out.println("Otro numero");
            texto = teclado.readLine();
            j = Integer.valueOf(texto);
            System.out.println("Division " + i + " / " + j + " = " + i/j);
            
        }
        catch (NumberFormatException ex1) {
            System.out.println("Error de formato numerico --> " + ex1.getMessage() );
        }
        catch (ArithmeticException ex2) {
            System.out.println("No se puede dividir entre 0 --> " + ex2.getMessage() );
        }
        
        System.out.println("\nFIN DEL PROGRAMA");
        
    }
    
}
