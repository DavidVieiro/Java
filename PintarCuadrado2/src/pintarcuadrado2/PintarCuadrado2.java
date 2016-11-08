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
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class PintarCuadrado2 {
    static int pintarCuadrado () throws IOException {
        int limite = 15; // tamaño maximo no permitido para dibujar el cuadrado
        int x = 0; // lado del cuadrado
        int i; // primer incremental
        int n; // segundo incremental
        int area; // area del cuadrado
        // introducir el InputStreamReader - BufferReader
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        System.out.println("Introduce el tamaño del cuadrado a dibujar. Lado menor que " + limite + ".");
        // usamos el try{}catch(){} para evitar errores con otro tipo de dato.
        try {
            x = Integer.parseInt(teclado.readLine());
        }
        catch ( NumberFormatException e ) {
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
            System.out.println("Introduce un valor correcto ( 1 - " + limite + " ).");
        }
        // calculo del area del cuadrado
        area = x*x;
        return area;
    }
    
    public static void main(String[] args) throws IOException {
        // variables
        int lado;
        // llamada al metodo / funcion
        lado = pintarCuadrado();
        // mensaje de salido
        System.out.println("El area del cuadrado es: " + lado);
    }
    
}
