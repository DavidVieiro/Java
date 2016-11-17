/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumero1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dam132
 */
public class AdivinarNumero1 {
    // Definimos las variables globales
    static BufferedReader teclado = new BufferedReader( new InputStreamReader( System.in ) );
    // Ponemos el numero de intentos en una constante
    static final int INTENTOS = 5;
    // Definimos la distacia en constantes
    static final int MUY_CERCA = 10;
    static final int CERCA = 20;
    static final int LEJOS = 30;
    
    // Creamos un modulo para que el jugador 1 introduzca el numero
    static int introducirNumero () throws IOException {
        // Definimos las variables minimo y maximo para establecer el limite de valores
        int numero = 0, minimo = 1, maximo = 100;
        
        // Creamos un bucle para comprobar que el valor introducido es correcto
        do {
            System.out.println("--- Jugador 1 ---\n");
            System.out.println("Introduce un numero entre 1 y 100:");
            // Usamos el TRY CATCH para evitar errores si se introducen otro dato que no sea numero
            try {
                numero = Integer.parseInt(teclado.readLine());
            }
            catch (NumberFormatException ex) {
                // Si introduce algo que no sea un numero le mostrara este mensaje
                System.out.println("Introduce numeros del 1 al 100.");
            }
            // Mantenemos el valor del numero introducido entre los parametros que queremos
            if ( numero < minimo || numero > maximo) {
                System.out.println("El numero introducido es incorrecto, vuelve a intentarlo...\n");
            }
        } while ( numero < minimo || numero > maximo );
        
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
    
    static int elJuego() throws IOException {
       
        // Jugador 1 Introduce un numero entre el 1 y el 100
        int juego = 0, numero, i = 1, adivinando;
        String distancia;
        boolean exit = false;
        numero = introducirNumero();
        
        // Jugador 2 trata de adivinar el numero con 5 intentos
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n--- Jugador 2 ----\n");
        System.out.println("Intenta adivinar el numero introducido por el Jugador 1:");
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
            System.out.println("El numero para acertar era --> " + numero);
        }
        
        return juego;
    }
    
    public static void main(String[] args) throws IOException {
        String opcion;
        char elegir;
        
        System.out.println("--- Este juego es para 2 Jugadores ---");
        System.out.println("La finalidad del juego es que el Jugador 1 introduzca un numero");
        System.out.println("entre 1 y 100 y el Jugador 2 tiene que adivinarlo.");
        System.out.println("El jugador 2 tiene 5 intentos para adivinar el numero.");
        System.out.println("Se le indicara al Jugador 2 si esta muy cerca de acertar el numero.");
        System.out.println("Te gustaria jugar al juego ahora? ( Si / No )");
        
        // Usamos el TRY CATCH para evitar errores si se introducen otro dato que no sea el que queremos
        
            opcion = String.valueOf(teclado.readLine());
            elegir = opcion.charAt(0);
        
        if (elegir == 's') {
            elJuego();
        }
        else {
            System.out.println("Se ha salido del juego. Vuelve mas tarde :)");
        }
        
    }
    
}
