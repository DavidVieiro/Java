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
            
            System.out.println("Elige una opcion ( 1 - 4 ):");
            System.out.println("- Pulse 1 - Covertir entre Pulgadas y Centimetros.");
            System.out.println("- Pulse 2 - Convertir entre Pies y Metros.");
            System.out.println("- Pulse 3 - Convertir entre Millas/hora y Km/hora.");
            System.out.println("- Pulse 4 - para SALIR del programa.");

            opcion = Byte.parseByte(teclado.readLine());

        } while (opcion < 1 || opcion > 4);
        return opcion;
    }
    
    static byte subMenuOpciones() throws IOException { 
        byte opcion2;
        
        do {
            
            System.out.println("¿En que direccion quieres realizar la conversion?");
            System.out.println("- Pulse 1 - Direccion normal ( Ej - Pulgadas -> Centimetros ) :");
            System.out.println("- Pulse 2 - Direccion inversa ( Ej - Centimetros -> Pulgadas ):");
            
            opcion2 = Byte.parseByte(teclado.readLine());

        } while (opcion2 < 1 || opcion2 > 2);
        
        return opcion2;
    }
    
    static double pulgadasCentimetros ( double centimetros ) {
        centimetros *= 2.54;
        return centimetros;
    }
    
    static double centimetrosPulgadas ( double pulgadas ) {
        pulgadas *= 0.393701;
        return pulgadas;
    }
    
    static double piesMetros ( double metros ) {
        metros *= 0.3048;
        return metros;
    }
    
    static double metrosPies ( double pies) {
        pies *= 3.280841666667;
        return pies;
    }
    
    static double millasHoraKilometrosHora ( double kilometrosHora) {
        kilometrosHora *= 1.60934;
        return kilometrosHora;
    }
    
    static double kilometrosHoraMillasHora ( double millasHora ) {
        millasHora *= 0.621371;
        return millasHora;
    }
        
    public static void main(String[] args) throws IOException {
        // definimos la variable y la inicializamos
        byte menu, subMenu = 0;
        double numero, n = 0;

        do {
            // llamamos al metodo / funcion
            menu = menuOpciones();
            if ( menu != 4 ) {
                subMenu = subMenuOpciones(); 
            }
            switch (menu) {
                case 1:
                    if ( subMenu == 1 ) {
                        System.out.println("Introduce una distancia en Pulgadas para convertirlo a Centimetros:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = pulgadasCentimetros(numero);
                    }
                    else {
                        System.out.println("Introduce una distancia en Centimetros para convertirlo a Pulgadas:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = centimetrosPulgadas(numero);
                    }
                    break;
                case 2:
                    if ( subMenu == 1 ) {
                        System.out.println("Introduce una distancia en Pies para convertirlo a Metros:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = piesMetros(numero);
                    }
                    else {
                        System.out.println("Introduce una distancia en Metros para convertirlo a Pies:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = metrosPies(numero);
                    }
                    break;
                case 3:
                    if ( subMenu == 1 ) {
                        System.out.println("Introduce una velodidad en Millas/h para convertirlo a Km/hora:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = millasHoraKilometrosHora(numero);
                    }
                    else {
                        System.out.println("Introduce una velodidad en Km/hora para convertirlo a Millas/h:");
                        numero = Double.parseDouble(teclado.readLine());
                        n = kilometrosHoraMillasHora(numero);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("La opcion introducida no existe. Vuelve a intentarlo.");
            }
            System.out.println("\nResultado de la conversion = " + n + "\n");
        } while ( menu != 4 );
        
    }
    
}
