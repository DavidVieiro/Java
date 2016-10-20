/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioatletas1;
/**
 *
 * @author dam132
 */
public class EjercicioAtletas1 {
    public static void main(String[] args) {
        

        float tiempo = 0;
        int edad = 0;
        String genero = null;
        boolean seleccionado = false;
        // string cadena;
        // cadena=objeto.next();
        // char car= cadenar.charAt(0);
        if ( genero == "H" || genero == "Hombre" ) {
            if ( edad <= 40 && tiempo <= 1.5 ) {
               seleccionado = true;
            }
            else if ( edad > 40 && tiempo <= 1.75 ) {
               seleccionado = true;
            }
        }
        else if ( genero == "M" || genero == "Mujer" ) {
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
