/** 
 * Clase principal para probar el programa.
 */

public class SeleccionMexicana {
    public static void main(String[] args) {
    Futbolista jugador = new Futbolista(1, "Salvador", "Perez", 25, 10, "Delantero"); 
    Entrenador entrenador = new Entrenador(2, "Gerardo", "Martino", 58, 1001);
        Masajista masajista = new Masajista(3, "Juan", "Perez", 45, "Fisioterapeuta", 20); 
        
        jugador.concentrarse();
        jugador.jugarPartido();

        entrenador.concentrarse();
        entrenador.dirigirPartido();

        masajista.concentrarse();
        masajista.darMasaje();
    }

}