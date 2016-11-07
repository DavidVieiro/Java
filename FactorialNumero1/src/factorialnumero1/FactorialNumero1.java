/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialnumero1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Calcula el factorial de un numero en un metodo.
// Recibe un numero como dato, calcula el factorial y muestra resultado.
/**
 *
 * @author dam132
 */
public class FactorialNumero1 {
    static int factorialNumero (int numero) throws IOException {
        // definimos las variables
        int c, factorial = 1;
        // introducir numero factorial
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        
        System.out.println("Introduce un numero para calcular su factorial:");
        try {
            numero = Integer.parseInt(teclado.readLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Valor introducido incorrecto. Usa numeros.");
        }
        // realizamos las operaciones
        if ( numero > 0 ) {
            for ( c = 1; c <= numero; c++ ) {
                factorial *= c;
            }
        }
        return factorial;
    }
    public static void main(String[] args) throws IOException {
        
        int factorial = 1;
        
        factorial = factorialNumero(factorial);
        
        System.out.println("El factorial del numero introducido es: " + factorial);
        
    }
    
}
