/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayor2;
// Crea un algoritmo que lea 20 numeros enteros e indique cual es el mayor de los numeros introducidos
// Preguntar al usuario cuando quiere parar de introducir datos.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class NumeroMayor2 {
    public static void main(String[] args) throws IOException {
        
        int i = 1;
        int numero;
        int numMayor = Integer.MIN_VALUE;
        String seguir;
        int sw;
        
        // introducir StreamReader
        InputStreamReader datos = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(datos);
                
        do {
            sw = 0;
            System.out.println("Introduce un numero entero:");
            numero = Integer.parseInt(reader.readLine());
            
            if ( numero > numMayor ) {
                numMayor = numero;
            }
            ++i;
            // preguntar si el usuario quiere continuar
            System.out.println("Quieres continuar introduciendo datos? (S / N):");
            seguir = reader.readLine();
            if ( "S".equals(seguir) | "s".equals(seguir) | "si".equals(seguir) | "Si".equals(seguir) ) {
                sw = 0; // se continua
            }
            else if ( "N".equals(seguir) | "n".equals(seguir) | "no".equals(seguir) | "No".equals(seguir) ) {
                sw = 1; // no se continua
            }
            else {
                System.out.println("Dato introducido incorrecto... Continuando el programa...");
            }
            
        } while ( sw == 0 );
        
        System.out.println("El numero mayor es " + numMayor);
    }
    
}
