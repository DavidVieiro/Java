/*
 * Crear Matriz de 3x4
 * 
 * Almacenar numeros
 * metodo mostrar tabla
 * mostrar los datos de fila 3
 * mostrar suma de cada fila
 * mostrar suma columna 3
 * ¿Donde esta el 5º numero?
 * Recorrer por columnas y mostrar
 */
package tablabidimensional1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author dam132
 */
public class TablaBidimensional1 {
    
    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    static final int FILAS = 3;
    static final int COLUM = 4;
    
    /**
     * 
     * @return
     * @throws IOException 
     */
    public static int[][] rellenarTabla() throws IOException {
        
        // Creamos el array y le establecemos un tamaño
        int tabla[][];
        tabla = new int[FILAS][COLUM];
        int numero, x = 1, y = 1, z = 1;
        boolean error; // Variable switch para comprobacion de errores.
        
        for ( int i = 0; i < tabla.length ; ++i ) {
            for ( int j = 0; j < tabla[i].length; ++j ) {
                do {
                    try {
                        System.out.println("Por favor introduce un numero para almacenarlo."
                        + "( DATO " + x + " en la FILA " + y + " de la COLUMNA " + z + " )");
                        numero = Integer.parseInt(teclado.readLine());
                        // Autoincremental para mostrar en el mensaje.
                        ++x; // Cantidad de datos totales
                        error = false;
                        // Introducimos los datos del usuario en la tabla.
                        tabla[i][j] = numero;
                    }
                    catch ( NumberFormatException ex1 ) {
                        System.out.println("\nERROR: Introduce un numero...\n");
                        error = true;
                    }
                } while ( error );
                ++y; // Autoincremental de las filas
            }
            y = 1;
            ++z; // Autoincremental de las columnas
        }
        
        return tabla;
    }
    
    /**
     * 
     * @param tabla 
     */
    public static void mostrarDatos( int[][] tabla ) {
        
        System.out.println("\n\n-- Mostrando datos de la tabla --");
        
        for ( int i = 0; i < tabla.length; ++i ) {
            for (int j = 0; j < tabla[i].length; ++j) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println(""); // Salto de linea por motivos esteticos.
        }
    }
    
    /**
     * 
     * @param tabla 
     */
    public static void mostrarDatosFila3( int[][] tabla ) {
        
        System.out.println("\n\n-- Mostrando datos de la Fila 3 --");
        
        for (int j = 0; j < tabla[2].length; ++j) {
            System.out.print(tabla[2][j] + "\t");
        }
        System.out.println(""); // Salto de linea por motivos esteticos.

    }
    
    /**
     * 
     * @param tabla 
     */
    public static void sumarFilas( int[][] tabla ) {
        
        int numero = 0;
        
        System.out.println("\n\n-- Mostrando suma de las filas --");
        
        for ( int i = 0; i < tabla.length; ++i ) {
            for (int j = 0; j < tabla[i].length; ++j) {
                numero += tabla[i][j];
            }
            System.out.println("SUMA FILA " + i + " - " + numero);
            numero = 0; // reiniciamos el valor de la variable
        }
    }
    
    /**
     * 
     * @param tabla 
     */
    public static void sumarCol3( int[][] tabla ) {
        
        int numero = 0;
        
        System.out.println("\n\n-- Mostrando suma de la COLUMNA 3 --");
        
        for ( int i = 0; i < tabla.length; ++i ) {
            numero += tabla[i][2];
        }
        System.out.println(numero);
    }
    
    /**
     * 
     * @param tabla 
     */
    public static void buscarQuinta(int[][] tabla) {
        
        int buscar;
        
        System.out.println("\n\n-- Buscando posicion --");
        
        buscar = tabla[0][1];
        
        System.out.println("El numero en esa posicion es: " + buscar);
    }
    
    
    public static void mostrarDatos2( int[][] tabla ) {
        
        System.out.println("\n\n-- Mostrando datos de la tabla --");
        
        for ( int j = 0, i = 0; j < tabla[i].length; ++j ) {
            for ( ; i < tabla.length; ++i) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println(""); // Salto de linea por motivos esteticos.
            i = 0;
        }
    }
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        // Definimos la tabla bidimensional y la rellenamos
        int tabla[][] = rellenarTabla();
        
        // Mostramos los datos de toda la tabla
        mostrarDatos(tabla);
        
        // Mostramos los datos de la Fila 3
        mostrarDatosFila3(tabla);
        
        // Mostramos la suma de cada fila.
        sumarFilas(tabla);
        
        // Mostramos la suma de la columna 3
        sumarCol3(tabla);
        
        // Buscamos cual es el numero introducido en quita posicion
        buscarQuinta(tabla);
        
        // Recorremos por columnas y mostramos.
        mostrarDatos2(tabla);
    }
    
}
