/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenararray1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Leer y almacenar 15 numeros
 * - Mostrarlos en orden inverso
 * - Permitir hacer una consulta si existe un nº determinado
 * - Buscar y mostrar el mayor
 *
 * a) Crear los metodos
 * - Mostrar datos
 * - Invertir los valores en la tabla con tabla auxiliar o no
 *
 * @author dam132
 */
public class AlmacenarArray1 {

    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    static final int LIMITE = 5;
    /**
     * Funcion para mostrar los datos almacenados en el array
     * @param array 
     */
    public static void mostrarNumeros (int array[]) {
        
        for (int f = 0; f < LIMITE; ++f) {
            System.out.println("Numero: " + array[f]);
        }
    }
    /**
     * Funcion paa invertir los datos almacenados en el array
     * @param array
     */
    public static void invertirArray (int array[]) {
       int numTemp;
        for ( byte i = 0; i < (array.length/2); ++i ) {
            numTemp = array[i];
            array[i] = array[array.length - (i+1)];
            array[array.length - (i+1)] = numTemp;
        }
    }
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        int numero = 0, buscarNumero = 0, tabla[], mayor = 0, resultado;
        tabla = new int[LIMITE];
        int i, f, j, x; // variables de los bucles
        boolean sw = false;
        
        // pedimos al usuario que introduzca los datos en el array
        for (i = 0; i < LIMITE; ++i) {
            System.out.println("Introduce un numero:");
            try {
                numero = Integer.parseInt(teclado.readLine());
            }
            catch (NumberFormatException ex11) {
                System.out.println("\nIntroduce un formato de numero correcto.");
            }

            tabla[i] = numero;
        }
        // mostramos los datos del array
        System.out.println("\n - Mostrando array - ");
        mostrarNumeros(tabla);
        
        // buscamos un numero que se encuentre en el array
        System.out.println("\nIntroduce un numero que quieres buscar:");
        try {
            buscarNumero = Integer.parseInt(teclado.readLine());
        }
        catch ( NumberFormatException ex21 ) {
            System.out.println("\nIntroduce un formato de numero correcto.");
        }
        
        for ( j = 0; j < LIMITE; ++j ) {
            if (tabla[j] == buscarNumero) {
                System.out.println("\nSe ha encontrado el numero que buscabas!");
                System.out.println("Esta en la posicion " + j + " del array");
                sw = true;
            }

        }
        if ( !sw ) {
            System.out.println("\nNo se ha encontrado el numero que buscas");
        }
        
        // buscamos el numero mayor
        resultado = Integer.MIN_VALUE;
        
        for ( x = 0; x < LIMITE; ++x ) {
            if ( tabla[x] > mayor ) {
                mayor = Math.max(tabla[x], resultado);
            }
            
        }
        System.out.println("\nEl numero mayor es: " + mayor);
        
        // invertir array
        System.out.println("\n - Mostrando Array Invertido - ");
        invertirArray(tabla);
        mostrarNumeros(tabla);
    }

}
