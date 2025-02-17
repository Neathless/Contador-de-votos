/** 
 * Clase Entrenador que hereda de Persona.
 */

public class Entrenador extends Persona {
    private int idFederacion;

    public Entrenador (int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(nombre +" Esta dirigiendo el partido");
    }
    public void dirigirEntrenamiento() {
        System.out.println(nombre + " está dirigiendo el entrenamiento.");
    }
}
