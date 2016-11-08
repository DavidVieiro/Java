/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialcalculo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/** Calculo de P sobre Q (Combinaciones de P Elementos cogidos en grupos de Q)
 * (SI P > 0 && Q >= 0 && P >= Q )
 *      SI Q = 0 || P = Q RESULTADO 1
 *          C (a,b) = a! / ( b! * ( a - b )! ) // calculo
 */
/**
 *
 * @author dam132
 */
public class FactorialCalculo1 {
    static float factorialNumero (float numero) throws IOException  {
        // definimos las variables
        int c;
        float factorial = 1;
        
        // realizamos las operaciones
        if ( numero > 0 ) {
            for ( c = 1; c <= numero; c++ ) {
                factorial *= c;
            }
        }
        else {
            System.out.println("Introduce un numero positivo.");
        }
        return factorial;
    }
    
    public static void main(String[] args) throws IOException {
        
        float resultado, factorial_q, factorial_p, fact3;
        int numero_q, numero_p;
        
        // introducir numero factorial
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        
        System.out.println("Introduce el valor de Q:");
        numero_q = Integer.parseInt(teclado.readLine());
        factorial_q = factorialNumero(numero_q);
        System.out.println("FACTORIAL Q = " + factorial_q);
                
        System.out.println("Introduce el valor de P:");
        numero_p = Integer.parseInt(teclado.readLine());
        factorial_p = factorialNumero(numero_p);
        System.out.println("FACTORIAL P = " + factorial_p);
        
        fact3 = numero_q - numero_p;
        
        if ( numero_p > 0 && numero_q >= 0 && numero_p >= numero_q ) {
            if ( numero_p == 0 || numero_p == numero_q ) {
                resultado = 1;
            }
            else {
                resultado = factorial_q / ( factorialNumero( fact3 ) * factorial_p );
                System.out.println("El resultado es: " + resultado);
            }
        }
        
    }
    
}
