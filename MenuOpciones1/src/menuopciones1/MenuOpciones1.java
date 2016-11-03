/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuopciones1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
/*  Crear un menu de opciones que permita realizar varios calculos
        pulse 1 para hallar su valor absoluto
        pulse 2 para calcular si raiz cuadrada
        pulse 3 para devolver el numero entero
        pulse 4 para redondear hacia arriba
        pulse 5 para elevarlo a un exponente
        pulse 6 para devolver el mayor de 2 numeros
        pulse 7 para salir del programa
    admitir solo opcion correcta
    realizar calculos y mostrar resultado.
*/
public class MenuOpciones1 {
    public static void main(String[] args) throws IOException {
        
        int menu, continuar = 1;
        double numero, numero2, n;
        
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        
        do {
            System.out.println("Elige una opcion ( 1 - 7 ):");
            System.out.println("- Pulse 1 - para hallar el valor absoluto de un numero.");
            System.out.println("- Pulse 2 - para calcular su raiz cuadrada.");
            System.out.println("- Pulse 3 - para devolver el numero entero.");
            System.out.println("- Pulse 4 - para redondear hacia arriba un numero.");
            System.out.println("- Pulse 5 - para elevar un numero a un exponente.");
            System.out.println("- Pulse 6 - para devolver el mayor de 2 numeros.");
            System.out.println("- Pulse 7 - para SALIR del programa.");
            menu = Integer.parseInt(teclado.readLine());
            
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
                    System.out.println("Se ha salido del programa.");
                    break;
                default:
                    System.out.println("La opcion introducida no existe. Vuelve a intentarlo.");
            }
        } while ( continuar == 1 );
        
    }
    
}
