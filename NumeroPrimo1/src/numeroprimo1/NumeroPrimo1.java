/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo1;

import java.util.Scanner;

/**
 *
 * @author dam132
 */
public class NumeroPrimo1 {
    public static void main(String[] args) {
        
        // inicializamos la variable
        int numero;
        int i;
        int primo = 0;
        
        // introducir el Scanner
        Scanner reader = new Scanner(System.in);
        
        // introducir el entero
        System.out.println("Introduce un numero entero:");
        numero = reader.nextInt();
        
        // for (ejecutado_primera_vez;condicion;incremento) { }
        for ( i = 1; i <= numero; ++i ) {

            if ( numero % i == 0 ){
                ++primo;
            }
        }
        if ( primo == 2 ) {
            System.out.println("El numero " + numero + " ES primo");
        }
        else {
            System.out.println("El numero " + numero + " NO ES primo");
        }
        
    }
}
