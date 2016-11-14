/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambitovariables1;

/**
 *
 * @author dam132
 */
public class AmbitoVariables1 {
    //variable blobal
    static int var1 = 333;
    
    static void metodoPrueba() {
        byte numero = 88;
    }
    
    public static void main(String[] args) {
        // variable local
        int var1 = 100;
        
        System.out.println("2 - var1(local) = " + var1);
        
        {
            int var2 = 88888;
            
            System.out.println("3 - var1(local) = " + var1);
            
            metodoPrueba();
            
        }
    }
    
}
