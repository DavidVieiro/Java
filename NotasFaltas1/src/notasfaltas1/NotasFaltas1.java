/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasfaltas1;
import java.util.Scanner;
/**
 *
 * @author dam132
 */
/*
 *    crear un algoritmo que calcule la nota final de un alumno, dadas:
 *    nota y numero de faltas
 *    
 *    FALTAS < 5 -> nota igual
 *    FALTAS ENTRE 5 y 10 -> nota -0.5
 *    FALTAS >10 y <20 -> nota -1
 *    FALTAS > 20 -> nota = 3
 *    NOTA <= 3 -> no cambia
 *    
 */
public class NotasFaltas1 {
    public static void main(String[] args) {
        // Introducir NOTA
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Introduce la nota: ");
        int nota = reader.nextInt(); // Scans the next token of the input as an int.
        // Introducir Numero de Faltas
        System.out.println("Introduce el numero de faltas: ");
        int faltas = reader.nextInt(); // Scans the next token of the input as an int.
        // nota = 0
        // faltas = 0
        // nota_falta = 0
        double nota_falta;
        
        if ( nota > 3 && nota <= 10 ) {
            if ( faltas < 5 ) {
                System.out.println("La nota es " + nota);
            }
            else if ( faltas >= 5 && faltas <= 10 ) {
                nota_falta = nota - 0.5;
                System.out.println("La nota es " + nota_falta );
//                System.out.println("La nota es " + (float)(nota - 0.5));
            }
            else if ( faltas >= 10 && faltas <= 20 ) {
                nota_falta = nota - 1;
                System.out.println("La nota es " + nota_falta );
            }
            else if ( faltas > 20 ) {
                nota_falta = nota - 3;
                System.out.println("La nota es " + nota_falta);
            }
            else {
                System.out.println("El numero de faltas introducido es incorrecto");
            }
        }
        else if ( nota <= 3 && nota >= 0) {
            System.out.println("La nota es " + nota);
        }
        else {
            System.out.println("La nota introducida es incorrecta");
        }
        
    }
    
}
