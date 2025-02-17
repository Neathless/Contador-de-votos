/** 
 * Clase base Persona que representa a un miembro de la selección.
 */
public class Persona {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Persona (int id, String nombre, String apellidos, int edad) {
   this.id = id;
   this.nombre = nombre;
   this.apellidos = apellidos;  
   this.edad = edad;   
    }

    public void concentrarse () {
        System.out.println("Concentrandose");
    }
    public void viajar () {
        System.out.println("Viajando");
    }
}