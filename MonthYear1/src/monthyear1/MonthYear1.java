/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monthyear1;
// Crear un programa en Java que lea 2 datos, año y mes.
// que nos muester los dias correspondientes al mes.
// NOTA: 1 año es bisiesto si es multiplo de 4 y no de 100
// o cuando es multiplo de 400
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author dam132
 */
public class MonthYear1 {
    public static void main(String[] args) throws IOException {
        
        int year, days = 0, month;
        
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        
        System.out.println("Introduzca un numero de mes ( 1 - 12 ):");
        month = Integer.parseInt(teclado.readLine());
        
        System.out.println("Introduzca un año:");
        year = Integer.parseInt(teclado.readLine());
        
        switch ( month ) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
                    days = 29;
                }
                else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                System.out.println("El mes introducido no es correcto.");
        }
        if ( days != 0 ) {
            System.out.println("El mes " + month + " del año " + year + " tiene: " + days + " días.");
        }
        
    }
    
}
