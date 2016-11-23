package misclases;
  
public class Animal{
    private int edad;
    private String nombre;

    public Animal(){
    }
    public Animal(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

    public void nace(){
        System.out.println("Hola mundo soy "+ this.nombre);
    }
    public void getNombre(){
        System.out.println(this.nombre);
    }
    public void getEdad(){
        System.out.println(this.edad);
//      visibilidadPrivada ();
    }
    
}