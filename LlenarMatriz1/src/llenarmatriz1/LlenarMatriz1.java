/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenarmatriz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * System.arraycopy();
 * Arrays.sort();
 * Arrays.binarySearch();
 * Array.fill();
 * Array.equals();
 * 
 * 
 * @author dam132
 */
public class LlenarMatriz1 {
    
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        int posicion;
        String matriz[] = {"Juan", "Pedro", "Antonio", "Marta", "Pepe"};
        
        String vector[] = new String[6];
        
        int numeros[] = {8,2,4,0,12};
        
        System.out.println("Busca un numero en el array");
        posicion = Integer.parseInt(teclado.readLine());
        
        // devuelve la posicion en la que se ha encontrado el numero
        int buscar1 = Arrays.binarySearch(numeros, posicion);
        
        if ( buscar1 >= 0) {
            System.out.println("Lo que buscas esta en la posicion: " + buscar1);
        }
        else {
            System.out.println("El numero que buscas no existe");
        }
        
        System.out.println("- No ordenado - ");
        
        // for-loop
        for (String matriz1 : matriz) {
            System.out.println("Dato " + matriz1);
        }
        Arrays.sort(matriz);
        System.out.println("\n- Ordenado - ");
        for ( int z = 0; z < matriz.length; z++ ) {
            System.out.println("Dato " + matriz[z]);
        }
    }
    
}
