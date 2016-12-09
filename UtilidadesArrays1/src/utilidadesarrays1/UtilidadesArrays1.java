/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesarrays1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Leer y almacenar 15 numeros: crear metodos
 * - rellenarTabla(); --> crea tabla, rellena y devuelve tabla
 * - Permitir hacer una consulta, si existe un numero determinado
 * - Buscar y mostrar el mayor
 * - mostrarDatos();
 * - invertirTabla();
 * 
 * @author dam132
 */
public class UtilidadesArrays1 {
    
    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    static final int LIMITE = 5; // Variable global y constante para limitar el array.
    
    /**
     * 
     * @return 
     * @throws java.io.IOException
     */
    public static int[] rellenarTabla() throws IOException {
        // Creamos el array y le establecemos un tamaño
        int tabla[];
        tabla = new int[LIMITE];
        int numero, x = 1;
        boolean error; // Variable switch para comprobacion de errores.
        
        for ( int i = 0; i < LIMITE ; ++i ) {
            do {
                try {
                    System.out.println("Por favor introduce un numero para almacenarlo. ( " + x + "  de " + LIMITE + " )");
                    numero = Integer.parseInt(teclado.readLine());
                    // Autoincremental para mostrar en el mensaje.
                    ++x;
                    error = false;
                    // Introducimos los datos del usuario en la tabla.
                    tabla[i] = numero;
                }
                catch ( NumberFormatException ex1 ) {
                    System.out.println("\nERROR: Introduce un numero...\n");
                    error = true;
                }
            } while ( error );
        }
        
        return tabla;
    }
    /**
     * 
     * @param tabla
     * @return
     * @throws IOException 
     */
    public static int buscarTabla( int[] tabla ) throws IOException {
        int posicion = 0;
        boolean error;
        
        do {
            try {
                System.out.println("\n\nBusca un numero en el array");
                posicion = Integer.parseInt(teclado.readLine());
                error = false;
            }
            catch ( NumberFormatException ex2 ) {
                error = true;
            }
        } while ( error );
        
        // devuelve la posicion en la que se ha encontrado el numero
        // hay que ordenarlo primero
        Arrays.sort(tabla);
        int buscar1 = Arrays.binarySearch(tabla, posicion);
        return buscar1;
    }
    /**
     * 
     * @param tabla
     * @return 
     */
    public static int numeroMayor( int[] tabla ) {
        int mayor;
        
        Arrays.sort(tabla);
        mayor = tabla[LIMITE-1];
        
        return mayor;
    }
    /**
     * 
     * @param tabla 
     */
    public static void mostrarDatos( int[] tabla ) {
        System.out.println("\n\n-- Mostrando datos de la tabla --");
        for ( int z = 0; z < tabla.length; ++z ) {
            System.out.println("Dato " + tabla[z]);
        }
    }
    /**
     * 
     * @param tabla 
     */
    public static void invertirTabla( int[] tabla ) {
        int temp;
        
        for(int i = 0; i < tabla.length / 2; i++)
        {
            temp = tabla[i];
            tabla[i] = tabla[tabla.length - i - 1];
            tabla[tabla.length - i - 1] = temp;
        }
        
        
    }
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int buscar1, mayor;
        int tabla[] = rellenarTabla();
        
        buscar1 = buscarTabla( tabla );
        // Si se encuentra el numero dara un valor positivo
        if ( buscar1 >= 0) {
            System.out.println("Lo que buscas esta en la posicion: " + buscar1);
        }
        else {
            System.out.println("\nERROR: El numero que buscas no existe\n");
        }
        
        // Busar el numero mayor y mostrarlo.
        mayor = numeroMayor(tabla);
        System.out.println("\nEl numero mayor es: " + mayor + "\n");
        
        // Mostrando datos de la tabla.
        mostrarDatos(tabla);
        
        // Invertir tabla.
        invertirTabla(tabla);
        System.out.println("\n\n-- Invirtiendo datos de la tabla --");
        mostrarDatos(tabla);
        
        System.out.println("\n\n\nFIN DE PROGRAMA...");
    }
    
}
