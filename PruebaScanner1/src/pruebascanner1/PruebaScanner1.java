/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebascanner1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dam132
 */
// programa que pase una velocidad de Km/h a m/s
public class PruebaScanner1 {
    public static void main(String[] args) {
        // Se introducen los datos
        Scanner reader = new Scanner(System.in); // creacion del objeto reader
        System.out.println("Introduce la velocidad en Km/h para convertirla a m/s:");
        
        try {
            float velocidad = reader.nextFloat(); // objeto.metodo()
            velocidad = (velocidad * 1000) / 3600;
            System.out.println("La velocidad es " + velocidad + " m/s");
        }
        // catch se ejecuta cuando encuentra algun error, el try se ejecuta linea por linea
        catch (InputMismatchException ex1) { // ex1 es para meter el error en esa variable.
            System.out.println("\nDatos introducidos incorrectos. Ejemplo: 50,5");
            System.out.println("\nERROR: " + ex1);
        }
        catch (Exception ex2) {
            System.out.println("Se ha producido un error inesperado");
            System.out.println("ERROR: " + ex2);
            // muestra la linea en la que se encuentra el error
            ex2.printStackTrace();
        }
        // finally {} se ejecutaria siempre
    }
    
}
