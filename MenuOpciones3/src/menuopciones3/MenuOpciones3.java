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
 * Menú : Cálculos
 *   1. Valor absoluto
 *   2. Potencia
 *   3. Raíz cuadrada
 *   4. Salir
 * c) Implementar dos metodos de calculos de distinta forma, igual
 *      Los apartados anteriores.
 *      Leer los datos y mostrar el resultado del calculos.
 *      Leer los datos y devuelve el resultado.
 * d) Implementar el tercer método de manera que pasamos datos, argumentos y devuelve el resultado.
 */

/**
 *
 * @author dam132
 */
public class MenuOpciones3 {
    
    static byte menuOpciones() throws IOException {
        byte opcion = 0;
        
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        
        do {
            
            System.out.println("Elige una opcion ( 1 - 7 ):");
            System.out.println("- Pulse 1 - para hallar el valor absoluto de un numero.");
            System.out.println("- Pulse 2 - para calcular la potencia de un numero.");
            System.out.println("- Pulse 3 - para calcular la raiz cuadrada de un numero.");
            System.out.println("- Pulse 4 - para SALIR del programa.");

            try {
                opcion = Byte.parseByte(teclado.readLine());
            }
            catch (NumberFormatException ex) {
                System.out.println("Valor introducido incorrecto. Usa numeros.");
            }
        } while (opcion < 1 || opcion > 7);
        return opcion;
        
    }
    
    static double calculos () throws IOException  {
        byte menu, continuar = 1;
        double numero, numero2, n = 0;

        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        do {
            try {
                menu = menuOpciones();
                
                switch (menu) {
                    case 1:
                        System.out.println("Introduce un numero para devolver su valor absoluto:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = Math.abs(numero);
                        break;
                    case 2:
                        System.out.println("Introduce un numero:");
                        numero = Double.parseDouble(teclado.readLine());
                        System.out.println("Introduce un numero");
                        numero2 = Double.parseDouble(teclado.readLine());
                        n = Math.pow(numero, numero2);
                        break;
                    case 3:
                        System.out.println("Introduce un numero para devolver su raiz cuadrada:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = Math.sqrt(numero);
                        break;
                    case 4:
                        continuar = 0;
                        break;
                    default:
                        System.out.println("La opcion introducida no existe. Vuelve a intentarlo.");
                }
                
            } catch (NumberFormatException ex) {
                System.out.println("Valor introducido incorrecto. Usa numeros.");
            }
            return n;
        } while ( continuar == 1 );
    }
    
    public static void main(String[] args) throws IOException {
        double resultado;
        
        resultado = calculos();
        
        if ( resultado != 0) {
           System.out.println("El resultado es: " + resultado + "\n"); 
        }
        System.out.println("Programa finalizado.");
    }
    
}
