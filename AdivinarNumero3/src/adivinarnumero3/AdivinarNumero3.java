/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumero3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author dam132
 */
public class AdivinarNumero3 {

    // Definimos las variables globales
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    
    // Creamos un modulo para que el jugador establezca el numero de intentos
    static int numIntentos() throws IOException {
        int intentos = 0;
        
        System.out.println("Introduce el numero de intentos (Numero entero):");
        // Como siempre usamos el TRY() CATCH() para evitar errores.
        try {
            intentos = Integer.parseInt(teclado.readLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Introduce un numero entero.");
        }
        
        return intentos;
    }
    
    // Creamos un modulo para que la maquina cree un numero aleatorio
    static int crearNumero () throws IOException {
        int numero, inicio = 0, fin = 0;
        
        System.out.println("Ahora tienes que introducir el rango para crear el numero aleatorio...");
        
        System.out.println("Introduce el inicio del rango (Numeros enteros):");
        try {
            inicio = Integer.parseInt(teclado.readLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Introduce un numero entero.");
        }
        
        System.out.println("Introduce el fin del rango (Numeros enteros):");
        try {
            fin = Integer.parseInt(teclado.readLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Introduce un numero entero.");
        }
        // con TreadLocalRandom creamos un numero entero aleatorio
        numero = ThreadLocalRandom.current().nextInt(inicio, fin);
        
        return numero;
    }
    
    // Creamos un modulo para que el jugador 2 introduzca datos
    static int adivinarNumero() throws IOException {
        // inicializamos la variable
        int adivina = 0;
        
        // Usamos el TRY CATCH para evitar errores si se introducen otro dato que no sea numero
        try {
            adivina = Integer.parseInt(teclado.readLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Introduce numeros enteros dentro del rango que has establecido.");
        }
        return adivina;
    }
    
    static String distanciaNumeros(int adivinando, int numero){
        String distancia;
        int mayor, menor, comparacion;
        
        mayor = Math.max(adivinando, numero);
        menor = Math.min(adivinando, numero);
        comparacion = mayor - menor;

        if ( comparacion <= 10 ) {
            distancia = "Estas muy cerca de acertar el numero...";
        }
        else if ( comparacion <= 20 ) {
            distancia = "Estas cerca de acertar el numero...";
        }
        else {
            distancia = "Estas lejos de acertar el numero...";
        }
        
        return distancia;
    }
    
    public static void main(String[] args) throws IOException {
        
        // La maquina crea un numero aleatorio entre el 1 y el 100
        int numero, i = 1, adivinando, intentos;
        boolean exit = false;
        String distancia;
        intentos = numIntentos();
        numero = crearNumero();
        //System.out.println("El numero es --> " + numero);
        // Jugador 2 trata de adivinar el numero con 5 intentos
        System.out.println("\n--- Jugador----\n");
        System.out.println("Intenta adivinar el numero introducido por el ordenador:");
        do {
            System.out.println("\nLlevas " + i + " intento/s de " + intentos);
            adivinando = adivinarNumero();
            
            if ( adivinando == numero ) {
                System.out.println("\nENHORABUENA HAS ACERTADO EL NUMERO!!!");
                exit = true;
            }
            else {
                distancia = distanciaNumeros(adivinando,numero);
                System.out.println(distancia);
            }
            ++i;
            
        } while ( i <= intentos && !exit );
        if ( !exit) {
            System.out.println("\nNo has acertado el numero, vuelve a jugar!");
            System.out.println("El numero a adivinar era: " + numero);
        }
    }
    
}

