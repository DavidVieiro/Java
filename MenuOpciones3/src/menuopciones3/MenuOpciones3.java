/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuopciones3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implementar dos metodos de calculos de distinta forma, igual
 *  a) Los apartados anteriores.
 *  b) Leer los datos y mostrar el resultado del calculos.
 *  c) Leer los datos y devuelve el resultado.
 */

/**
 *
 * @author dam132
 */
public class MenuOpciones3 {
    
    static int menuOpciones() {
        return 0;
        
    }
    
    public static void main(String[] args) throws IOException {
        try {
            int menu = 7, continuar = 1;
            double numero, numero2, n;
            
            InputStreamReader flujo = new InputStreamReader(System.in);
            BufferedReader teclado = new BufferedReader(flujo);
            
            do {
                //menu = menuOpciones();
                
                switch (menu) {
                    case 1:
                        System.out.println("Introduce un numero para devolver su valor absoluto:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = Math.abs(numero);
                        System.out.println("El valor absoluto de " + numero + " es: " + n + "\n");
                        break;
                    case 2:
                        System.out.println("Introduce un numero para devolver su raiz cuadrada:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = Math.sqrt(numero);
                        System.out.println("La raiz cuadrada de " + numero + " es: " + n + "\n");
                        break;
                    case 3:
                        System.out.println("Introduce un numero para devolver el numero entero:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = Math.rint(numero);
                        System.out.println("El valor entero de " + numero + " es: " + n + "\n");
                        break;
                    case 4:
                        System.out.println("Introduce un numero para redondearlo hacia arriba:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = Math.round(numero);
                        System.out.println("El resultado del " + numero + " es: " + n + "\n");
                        break;
                    case 5:
                        System.out.println("Introduce un numero:");
                        numero = Double.parseDouble(teclado.readLine());
                        System.out.println("Introduce un exponente para el numero anterior:");
                        numero2 = Double.parseDouble(teclado.readLine());
                        n = Math.pow(numero, numero2);
                        System.out.println("El numero " + numero + " elevado a " + numero2 +" es: " + n + "\n");
                        break;
                    case 6:
                        System.out.println("Introduce un numero para compararlo con el siguiente:");
                        numero = Double.parseDouble(teclado.readLine());
                        System.out.println("Introduce un numero para compararlo con el anterior:");
                        numero2 = Double.parseDouble(teclado.readLine());
                        n = Math.max(numero,numero2);
                        System.out.println("El mayor entre " + numero + " y " + numero2 + " es: " + n + "\n");
                        break;
                    case 7:
                        continuar = 0;
                        break;
                    default:
                        System.out.println("La opcion introducida no existe. Vuelve a intentarlo.");
                }
            } while ( continuar == 1 );
        } catch (NumberFormatException ex) {
            System.out.println("Valor introducido incorrecto. Usa numeros.");
        }
    }
    
}
