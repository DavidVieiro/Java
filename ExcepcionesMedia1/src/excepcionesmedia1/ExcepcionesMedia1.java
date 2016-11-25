/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesmedia1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Propagar excepciones
 * Leer 5 numeros. Crear metodo leerEntero(), lee y devuelve dato
 * controlar excepciones en el main()
 * Mostrar Media
 * 
 * @author dam132
 */
public class ExcepcionesMedia1 {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    static int leerEntero () throws IOException {
        int entero = 0;
        
        System.out.println("Introduce un numero entero:");
        while ( entero <= 0) {
            entero = Integer.parseInt(teclado.readLine());
        }
        
        return entero;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1, numeroEntero, suma = 0, media;
        boolean correcto = false;
        System.out.println("Se va a calcular la media de 5 numeros entero introducidos");
        try {
            do {
                try {
                    numeroEntero = leerEntero();
                    suma += numeroEntero; 
                    ++i;
                }
                catch ( NumberFormatException ex1 ) {
                    System.out.println("\nDato incorrecto, introduce numeros enteros\n");
                    correcto = false;
                }
            }while ( correcto == false && i <= 5 );
            
            media = suma / 5;
            System.out.println("La media es: " + media);
        }
        catch ( Exception ex2 ) {
            System.out.println("\nERROR inesperado: " + ex2);
            ex2.printStackTrace();
        }
        System.out.println("\nFIN DEL PROGRAMA...");
        
    }
    
}
