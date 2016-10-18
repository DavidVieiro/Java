/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores2;
/**
 *
 * @author dam132
 */
public class Operadores2 {
    public static void main(String[] args) {
        // Definicion de variables
        int y = 1, x = 5;
        int x_mas, mas_y, mayor, q;
        boolean positivo = false;
        
        y *= x + 1;
        System.out.println("1. y * ( x + 1 ) = " + y); // y = 1 * ( 5 + 1 ) = 6
        y /= ( 5 + x );
        System.out.println("2. y / ( 5 + x ) = " + y); // y = 6 / ( 5 + 5 ) = 0
        y = --x + 2;
        System.out.println("3. --x + 2 = " + y); // y = 4 + 2 = 6
        x_mas = x++; // x_mas = x; x = x + 1;
        mas_y = ++y; // mas_y = y + 1;
        System.out.println("4. x_mas = " + x_mas + ", mas_y = " + mas_y + ", x = " + x + ", y = " + y); // Valor actual de las variables
        q = 2 * ++y; // 2 * ( y + 1 );
        System.out.println("2 * ( y + 1 ) = " + q); // 2 * 8 = 16
        q = 2 * x++; // 2 * x; x = x + 1;
        System.out.println("2 * x = " + q); // 2 * 5 = 10
        
        mayor = x > y ? x++ : --y; // condicional if ( x > y ) then x++ else --y end
        if ( mayor > 0) {
            System.out.println("mayor es distinto de cero");
            //positivo = true;
        }
        if ( !positivo )
            System.out.println("positivo es ???????");
    }
}
