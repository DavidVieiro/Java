/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuconversiones1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Crear una aplicación que muestre el menú de opciones
 * siguiente y permita hacer el proceso de conversiones:
 * 
 * Menú de conversiones:
 * 
 * Pulgadas --- centímetros (1p son 2,5cm)
 * Pies --- metros          (1pie son 0,3048 m)
 * Millas/ hora --- Km/h    (50mills/h son 80 km/h)
 * 
 * Se aplicará la programación modular en todos los casos, y se podrán 
 * realizar las conversiones mientras no se elija la opción de salir.
 * 
 * @author dam132
 */
public class MenuConversiones1 {
    // variable global para leer datos en todos los metodos / funciones.
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    static byte menuOpciones() throws IOException {
        byte opcion;
        
        do {
            
            System.out.println("Elige una opcion ( 1 - 7 ):");
            System.out.println("- Pulse 1 - Covertir de Pulgadas a Centimetros.");
            System.out.println("- Pulse 2 - Convertir de Pies a Metros.");
            System.out.println("- Pulse 3 - Convertir de Millas/hora a Km/hora.");
            System.out.println("- Pulse 4 - para SALIR del programa.");

            opcion = Byte.parseByte(teclado.readLine());

        } while (opcion < 1 || opcion > 4);
        return opcion;
    }
    
    static double pulgadasCentimetros ( double centimetros ) {
        centimetros *= 2.54;
        return centimetros;
    }
    
    static double piesMetros ( double metros ) {
        metros *= 0.3048;
        return metros;
    }
    
    static double millasHoraKilometrosHora ( double kilometrosHora) {
        kilometrosHora *= 1.60934;
        return kilometrosHora;
    }
    
    static double calculos () throws IOException  {
        byte menu;
        double numero, n = 0;

        do {
            menu = menuOpciones();

            switch (menu) {
                case 1:
                    System.out.println("Introduce una distancia en Pulgadas para convertirlo a Centimetros:");
                    numero = Double.parseDouble(teclado.readLine());
                    n = pulgadasCentimetros(numero);
                    break;
                case 2:
                    System.out.println("Introduce una distancia en Pies para convertirlo a Metros:");
                    numero = Double.parseDouble(teclado.readLine());
                    n = piesMetros(numero);
                    break;
                case 3:
                    System.out.println("Introduce una velodidad en Millas/h para convertirlo a Km/hora:");
                    numero = Double.parseDouble(teclado.readLine());
                    n = millasHoraKilometrosHora(numero);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("La opcion introducida no existe. Vuelve a intentarlo.");
            }
            return n;
        } while ( menu != 4 );
        
    }
    
    public static void main(String[] args) throws IOException {
        // definimos la variable y la inicializamos
        double resultado;
        // llamamos al metodo / funcion
        do {
            resultado = calculos();
            // devolvemos un mensaje
            if ( resultado != 0 ) {
                System.out.println("\nResultado de la conversion = " + resultado + "\n");
            }
        } while ( resultado != 0 );
        
    }
    
}
