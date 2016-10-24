/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cualificacionswitch1;
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
public class CualificacionSwitch1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Introduce una nota (0 - 10): ");
        int nota = reader.nextInt(); // Scans the next token of the input as an int.
        
        switch (nota) {
            case 0: case 1: case 2: case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota incorrecta, introduce una nota de 0 a 10");
        }
        
    }
    
}
