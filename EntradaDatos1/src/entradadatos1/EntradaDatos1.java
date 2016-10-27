/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatos1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class EntradaDatos1 {
    public static void main(String[] args) {
        String nombre, s, cadena;
        int n;
        float f;
        
        InputStreamReader flujo = new InputStreamReader(System.in);
        
        BufferedReader teclado = new BufferedReader(flujo);
        
        System.out.println("Introduzca un nombre:");
        s = teclado.readLine();
        System.out.println("Su nombre: " + s);
        
        System.out.println("Introduzca un número:");
        n = Integer.parseInt(cadena);
        System.out.println("El numero " + n);
        
        System.out.println("El numero con decimales:");
        f = Float.parseFloat(teclado.readLine());
        System.out.println("El numero " + f);
        
        nombre = "Cadenas probando";
        System.out.println(nombre + " " + nombre.charAt(0));
        
        // pruebas conversiones
        char c = Character.toUpperCase('a');
        String b = String.valueOf(true);
        float numero = Float.parseFloat("3.99");
        System.out.println(".........");
        Integer objeto = Integer.valueOf(n);
        
        // objeto
        int unnumero = objeto.intValue();
        System.out.println(unnumero + "..." + objeto.toString());
        
    }
    
}
