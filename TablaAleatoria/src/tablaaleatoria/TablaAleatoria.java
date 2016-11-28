/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaaleatoria;

import java.util.Random;

/**
 *
 * @author dam132
 */
public class TablaAleatoria {
    
    static Random aleatorio = new Random();
    
    static int calculoAleatorio ( int modulo ) {
        
        return Math.abs( aleatorio.nextInt() ) % modulo + 1;
    }
    public static void main(String[] args) {
        
        int tabla[];
        tabla = new int [calculoAleatorio(20)];
        
        System.out.println("Tamaño tabla " + tabla.length);
        
        try {
            for ( int i = 0; i < tabla.length; i++ ) {
                tabla[i] = i * 7;
            }
            for (int i = 0; i < tabla.length; i++ ) {
                System.out.println("Dato " + tabla[i]);
            }
        }
        catch ( IndexOutOfBoundsException | NumberFormatException ex1 ) {
            System.out.println("Error " + ex1);
        }
        catch ( Exception ex2 ) {
            System.out.println("Error " + ex2);
        }
    }
    
}
