/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moldeodatos1;
/**
 *
 * @author dam132
 */
public class MoldeoDatos1 {
    public static void main(String[] args) {
        
        int x = 3;
        double y = 5;
        float z, raiz;
        
        // sin F o (float) hay posible perdida de datos en la conversion.
        // tambien sirve usar L o (long)
        // z = x + 8.9; // error
        z = x + 8.9F ; // probar sin letra F
        
        // sin indicarle al resultado que es un float hay perdida de datos.
        // z = (200 * y + x); //
        z = (float) (200 * y + x); // hacer con y sin moldeo
        
        System.out.println("1. valor float(z): " + z);
        System.out.println("2. valor double(z): " + (double)z);
        System.out.println("3. valor int(z): " + (int)z);
        System.out.println("4. valor byte(z): " + (byte)z);
        System.out.println("5. Valor double(y): " + (double)y);
        
        // int d = (float)x / 2; // error perdida de datos
        int d = (int) ((float)x / 2); // se necesita indicarle que el resultado sera (int)
        
        z = (float)(200 * x); // probar error ALT + ENTER, sugerencia
        
        // raiz = Math.sqrt(10); // error perdida de datos
        raiz = (float)Math.sqrt(10); // debemos indicarle que el resultado sera un (float)
    }
    
}
