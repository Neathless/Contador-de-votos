/** 
 * Clase Masajista que hereda de Persona.
 */

public class Masajista extends Persona{

    private String profesion;
    private int aniosExperiencia;

    public Masajista (int id, String nombre, String apellidos, int edad, String profesion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(nombre + " está dando un masaje.");
    }
    
}
