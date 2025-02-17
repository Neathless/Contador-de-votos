/** 
 * Clase Futbolista que hereda de Persona.
 */
public class Futbolista extends Persona {

    private int  numPlay; 
    private String posicionEnCancha;

    public Futbolista (int id, String nombre, String apellidos, int edad, int numPlay, String posicionEnCancha) {
        super(id, nombre, apellidos, edad);
        this.numPlay = numPlay;
        this.posicionEnCancha = posicionEnCancha;
    }

    public void jugarPartido () {
        System.out.println(nombre +"Jugando elpartido");
    }
    public void entrenar () {
        System.out.println (nombre +"Esta entrenando");
    }
    
}
