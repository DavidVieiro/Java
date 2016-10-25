/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintarcuadrado1;

import java.util.Scanner;

/**
 *
 * @author dam132
 */
// Dado un numero entero dibujar un cuadrado dado el tamaño del lado. Lado menor que 15.
public class PintarCuadrado1 {
    public static void main(String[] args) {
        // definir variables
        int limite = 15; // tamaño maximo no permitido para dibujar el cuadrado
        int x = 0; // tamaño del cuadrado
        int i; // primer incremental
        int n; // segundo incremental
        
        // introducir el Scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadrado a dibujar. Lado menor que " + limite + ".");
        // usamos el try{}catch(){} para evitar errores con otro tipo de dato.
        try {
            x = reader.nextInt();
        }
        catch ( Exception e) {
            System.out.println("El dato introducido no es correcto. Usa numeros enteros.");
        }
        // bucle dentro de bucle para crear el cuadrado.
        if ( x < limite && x > 0 ) {
            for ( i = 1; i <= x; ++i ) {
                for ( n = 1; n <= x; ++n ) {
                    System.out.print("*"); // print no hace salto de linea
                }
                System.out.println(""); // se introduce aqui el println para que haga el salto de linea
            }
        }
        else {
            System.out.println("Introduce un valor correcto ( 1 - " + ( limite - 1) + " ).");
        }
    }
    
}
