/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumero2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author dam132
 */
public class AdivinarNumero2 {

    // Definimos las variables globales
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    // Ponemos el numero de intentos en una constante
    static final int INTENTOS = 5;
    // Definimos la distacia en constantes
    static final int MUY_CERCA = 10;
    static final int CERCA = 20;
    static final int LEJOS = 30;
    
    // Creamos un modulo para que la maquina cree un numero aleatorio
    static int crearNumero () {
        int numero;
        // con TreadLocalRandom creamos un numero entero aleatorio
        System.out.println("La maquina ya ha creado el numero para adivinar, SUERTE!!");
        numero = ThreadLocalRandom.current().nextInt(1, 100);
        
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
            System.out.println("Introduce numeros del 1 al 100.");
        }
        return adivina;
    }
    
    // Creamos un modulos para comprobar la distancia entre los dos numeros
    static String distanciaNumeros(int adivinando, int numero){
        String distancia;
        int mayor, menor, comparacion;
        
        mayor = Math.max(adivinando, numero);
        menor = Math.min(adivinando, numero);
        comparacion = mayor - menor;

        if ( comparacion <= MUY_CERCA ) {
            distancia = "Estas muy cerca de acertar el numero...";
        }
        else if ( comparacion <= CERCA ) {
            distancia = "Estas cerca de acertar el numero...";
        }
        else if ( comparacion <= LEJOS ) {
            distancia = "Estas lejos de acertar el numero...";
        }
        else {
            distancia = "Estas demasiado lejos";
        }
        
        return distancia;
    }
    
    public static void main(String[] args) throws IOException {
        
        // La maquina crea un numero aleatorio entre el 1 y el 100
        int numero, i = 1, adivinando;
        String distancia;
        boolean exit = false;
        numero = crearNumero();
        //System.out.println("El numero es --> " + numero);
        // Jugador 2 trata de adivinar el numero con 5 intentos
        System.out.println("\n--- Jugador----\n");
        System.out.println("Intenta adivinar el numero introducido por el ordenador:");
        do {
            System.out.println("\nLlevas " + i + " intento/s de " + INTENTOS);
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
            
        } while ( i <= INTENTOS && !exit );
        if ( !exit) {
            System.out.println("\nNo has acertado el numero, vuelve a jugar!");
        }
    }
    
}
