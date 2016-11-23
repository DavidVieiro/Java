/*Crear proyecto con dos paquetes
 * misclases => Animal .....nivel paquete
 * aplicacion => MiApliacion
 */
package aplicacion;

import misclases.Animal;

/**
 *
 * @author dam132
 */
public class MiAplicacion {
    public static void main (String [] args){
        Animal migato = new Animal(2, "calcetines");
        Animal mio = new Animal();
        migato.getNombre();
    
        //visibilidad publica
        migato.nace();
        ////****visibilidad paquete  =>error
//      migato.visibilidadPaquete();
      
        ////****visibilidad protegida  =>error
//     migato.visibilidadProtegida();
    
        ///****visibilidad privada  =>error
//      migato.visibilidadPrivada ();
    }
    
    
}
