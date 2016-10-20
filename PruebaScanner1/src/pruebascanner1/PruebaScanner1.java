/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebascanner1;

import java.util.Scanner;

/**
 *
 * @author dam132
 */
// programa que pase una velocidad e Km/h a m/s
public class PruebaScanner1 {
    public static void main(String[] args) {
        // Se introducen los datos
        Scanner reader = new Scanner(System.in); // creacion del objeto reader
        System.out.println("Introduce la velocidad en Km/h para convertirla a m/s:");
        
        // http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=678:gestion-de-excepciones-en-java-captura-con-bloques-try-catch-finally-ejemplos-resueltos-sencillos-cu00927c&catid=58:curso-lenguaje-programacion-java-nivel-avanzado-i&Itemid=180
        try {
            float velocidad = reader.nextFloat(); // objeto.metodo()
            velocidad = (velocidad * 1000) / 3600;
            System.out.println("La velocidad es " + velocidad + " m/s");
        }
        // catch se ejecuta cuando encuentra algun error, el try se ejecuta linea por linea
        catch (Exception e) { // e es para meter el error en esa variable.
            System.out.println("Datos introducidos incorrectos. Ejemplo: 50,5");
        }
        // finally {} se ejecutaria siempre
    }

    
}
