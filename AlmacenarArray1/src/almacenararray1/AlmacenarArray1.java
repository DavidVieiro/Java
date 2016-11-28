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
 * 
 * a) Crear los metodos
 * - Mostrar datos
 * - Invertir los valores en la tabla con tabla auxiliar o no
 * 
 * @author dam132
 */
public class AlmacenarArray1 {
    
     static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
     static final int LIMITE = 5;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
       int numero, tabla[];
       tabla = new int [LIMITE];
       
       for ( int i = 0; i < LIMITE ; ++i ) {
           System.out.println("Introduce un numero:");
           numero = Integer.parseInt(teclado.readLine());
           
           tabla[i] = numero;
       }
       
       for (int i = LIMITE-1 ; i >= 0; --i ) {
           System.out.println("numero " + tabla[i]);
       }
    }
    
}
