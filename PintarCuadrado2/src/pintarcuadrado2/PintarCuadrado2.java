/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintarcuadrado2;
// Crear modulo para pintar cuadrado
// Dado un numero entero dibujar un cuadrado dado el tamaño del lado. Lado maximo 15.
// Recibe el valor del lado y devuelve el area del cuadrado

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class PintarCuadrado2 {
    // Definimos la variable LIMITE como global y estatica.
    // tamaño maximo no permitido para dibujar el cuadrado
    public static final int LIMITE = 15;
    
    static int pintarCuadrado () {
        int area = 0;
        int x; // lado del cuadrado
        int i; // primer incremental
        int n; // segundo incremental
        
        // introducir el InputStreamReader - BufferReader
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        
        // usamos el try{}catch(){} para evitar errores con otro tipo de dato.
        try {
            System.out.println("Introduce el tamaño del cuadrado a dibujar. Lado menor que " + LIMITE + ".");
            x = Integer.parseInt(teclado.readLine());
            
            // bucle dentro de bucle para crear el cuadrado.
            if ( x <= LIMITE && x > 0 ) {
                for ( i = 1; i <= x; ++i ) {
                    for ( n = 1; n <= x; ++n ) {
                        System.out.print("*"); // print no hace salto de linea
                    }
                    System.out.println(""); // se introduce aqui el println para que haga el salto de linea
                }
            }
            else {
                System.out.println("Introduce un valor correcto ( 1 - " + LIMITE + " ).");
            }
            // calculo del area del cuadrado
            area = x*x;
        }
        catch ( NumberFormatException ex1 ) {
            System.out.println("\nEl dato introducido no es correcto. Usa numeros enteros.");
            System.out.println("ERROR: " + ex1);
        }
        catch ( Exception ex2 ) {
            System.out.println("\nError inesperado...");
            System.out.println("ERROR: " + ex2);
            ex2.printStackTrace();
        }
        return area;
    }
    
    public static void main(String[] args) {
        // variables
        int resArea;
        // llamada al metodo / funcion
        resArea = pintarCuadrado();
        // mensaje de salido
        if ( resArea != 0 ) {
            System.out.println("El area del cuadrado es: " + resArea);
        }
                
    }
    
}
