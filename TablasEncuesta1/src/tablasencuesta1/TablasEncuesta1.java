/*
 * Se realiza una encuesta a varias/100 personas y se pregunta por el mes de nacimiento.
 * Crear un vector con nombre de los meses y el vector para contar cada caso
 * Mostrar cuantas personas nacieron en cada mes:
 * 
 * Enero…...xx
 * Febrero…..
 */
package tablasencuesta1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam132
 */
public class TablasEncuesta1 {
    
    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    static final int MESES    = 12;
    static final int PERSONAS = 10; // Numero de personas por cada vuelta
    static final int VECES    = 2; // Limite de bucles para introducir datos
    static int vueltas = 0;
    
    /**
     * 
     * @param tabla
     * @param meses
     * @throws IOException 
     */
    public static void rellenarTabla( int[] tabla, String[] meses) throws IOException {
        
        int cantidad = 0, i;
        boolean error =  true; // Variable switch para comprobacion de errores.
        
        do {
            // Mostramos los meses como opciones de menu
            mostrarMeses(meses);
            try {
                System.out.println("\n\nIntroduce el numero de mes en el que has nacido:");
                i = Integer.parseInt(teclado.readLine());
                // Usamos el condicional para controlar que este dentro de los parametros del array
                if ( i >= 0 && i < 12 ) {
                    // Controlamos el error
                    error = false;
                    // Incremental para controlar la cantidad de datos introducidos.
                    ++cantidad;
                    // Incrementamos el dato existente en la tabla
                    ++tabla[i];
                }
            }
            catch ( NumberFormatException ex1 ) {
                System.out.println("\nERROR: Introduce un numero entero...\n");
                error = true;
            }
        } while ( error || cantidad < PERSONAS );
        
    }
    
    /**
     * 
     * @param meses
     */
    public static void mostrarMeses(String[] meses) {
        
        System.out.println("\n\n-- Mostrando los meses --");
        for ( int z = 0; z < meses.length; ++z ) {
            System.out.println("Opcion " + z + " -->\t" + meses[z]);
        }
    }
    
    /**
     * 
     * @param tabla 
     * @param meses 
     */
    public static void mostrarDatos( int[] tabla, String[] meses ) {
        
        System.out.println("\n\n-- Mostrando datos de la tabla --");
        for ( int z = 0; z < tabla.length; ++z ) {
            System.out.print(meses[z] + " -->\t");
            System.out.print(tabla[z] + "\n");
        }
    }
    
    public static byte mostrarMenu (int[] tabla, String[] meses) throws IOException {
        
        byte opcion = 0;
        
        System.out.println("\n1 - Rellenar datos ( " + PERSONAS + " de cada vez )");
        System.out.println("2 - Mostrar datos");
        System.out.println("3 - SALIR y Mostrar datos");
        System.out.println("\nIntroduce la opcion que quieres ");
        
        try {
            // Se introduce la opcion que se quiere.
            opcion = Byte.parseByte(teclado.readLine());
        }
        catch ( NumberFormatException ex1 ) {
            System.out.println("\nERROR: Introduce un numero entero...");
        }
        
        switch ( opcion ) {
            case 1:
                if ( vueltas != VECES ) {
                    // Introducimos los datos en la tabla
                    rellenarTabla(tabla, meses);
                    ++vueltas;
                }
                else {
                    System.out.println("\n\nAVISO: Has llegado al limite de datos introducidos.");
                }
                
                break;
            case 2:
                // Mostramos los datos de la tabla
                mostrarDatos(tabla, meses);
                break;
            case 3:
                // SALIR
                // Mostramos los datos de la tabla
                mostrarDatos(tabla, meses);
                break;
            default:
                System.out.println("\nERROR: Introduce una opcion correcta...\n");
        }
        
        return opcion;
    }
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        int opcion;
        
        // Creamos un array para almacenar los nombre de los meses
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
           "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        // Creamos un array para almacenar la cantidad de personas que cumplen cada mes
        int tabla[];
        tabla = new int[MESES];
        
        do {
            // Mostramos el menu con sus opciones.
            opcion = mostrarMenu(tabla, meses);
        } while ( opcion != 3);
        
        System.out.println("\n\nFIN DEL PROGRAMA");
    }
    
}
