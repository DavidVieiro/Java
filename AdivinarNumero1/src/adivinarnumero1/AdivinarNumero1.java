/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumero1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class AdivinarNumero1 {
    // definimos las variables globales
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    // ponemos el numero de intentos en una constante
    static final int intentos = 5;
    
    // creamos un modulo para que el jugador 1 introduzca el numero
    static int introducirNumero () throws IOException {
        
        int numero = 0;
        
        // creamos un bucle para comprobar que el valor introducido es correcto
        do {
            System.out.println("Jugador 1 - Introduce un numero enter 1 y 100:");
            // usamos el TRY CATCH para evitar errores si se introducen otro dato que no sea numero
            try {
                numero = Integer.parseInt(teclado.readLine());
            }
            catch (NumberFormatException ex) {
                System.out.println("Introduce numeros del 1 al 100.");
            }
            if ( numero < 1 || numero > 100) {
                System.out.println("El numero introducido es incorrecto, vuelve a intentarlo...\n");
            }
        } while ( numero < 1 || numero > 100 );
        
        return numero;
    }
    
    static int adivinarNumero() throws IOException {
        int adivina;
        
        adivina = Integer.parseInt(teclado.readLine());
        
        return adivina;
    }
    
    public static void main(String[] args) throws IOException {
        // Jugador 1 Introduce un numero entre el 1 y el 100
        int numero = introducirNumero();
        
        System.out.println("El numero es --> " + numero );
        // Jugador 2 trata de adivinar el numero con 5 intentos
        
        
        
    }
    
}
