/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioatletas1;
import java.util.Scanner;
/**
 *
 * @author dam132
 */
public class EjercicioAtletas1 {
    public static void main(String[] args) {
        
        // introducir el Scanner
        Scanner reader = new Scanner(System.in);
        
        // edad
        System.out.println("Introduce la edad del atleta:");
        int edad = reader.nextInt();
        
        // genero
        System.out.println("Introduce el genero del atleta ( Hombre - Mujer ):");
        String genero = reader.next();
        
        // tiempo
        System.out.println("Introduce el Tiempo que hizo el atleta:");
        float tiempo = reader.nextFloat();
        
        // ha sido seleccionado, falso por defecto
        boolean seleccionado = false;
        // string cadena;
        // cadena=objeto.next();
        // char car= cadenar.charAt(0);
        
        if ( "Hombre".equals(genero)
          || "H".equals(genero)
          || "hombre".equals(genero)
          || "h".equals(genero)
           ) {
            if ( edad > 0 && edad <= 40 && tiempo <= 1.5 ) {
               seleccionado = true;
            }
            else if ( edad > 0 && edad > 40 && tiempo <= 1.75 ) {
               seleccionado = true;
            }
        }
        else if ( edad > 0 && "Mujer".equals(genero)
               || edad > 0 && "M".equals(genero)
               || edad > 0 && "mujer".equals(genero)
               || edad > 0 && "m".equals(genero)
                ) {
            if ( tiempo <= 1.8 ) {
                seleccionado = true;
            }
        }
        // Mostrar el mensaje si se selecciono o no.
        if ( seleccionado) {
            System.out.println("Has sido seleccionado");
        }
        else {
            System.out.println("No has sido seleccionado");
        }
        
    }
    
}
