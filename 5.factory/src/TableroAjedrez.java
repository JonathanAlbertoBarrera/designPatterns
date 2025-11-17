import java.util.ArrayList;
import java.util.List;

// Esta clase extiende de Tablero y es la encargada de crear un juego de ajedrez
// Implemento el Factory Method para crear instancias específicas de JuegoAjedrez
public class TableroAjedrez extends Tablero {
    
    // Este es mi Factory Method que crea un juego específico (Ajedrez)
    // Sobrescribo el método abstracto de la clase padre Tablero
    @Override
    public Juego crearJuego() {
        // Aquí creo y retorno una instancia de JuegoAjedrez
        // Por ahora retorno null, pero debería recibir los dos jugadores como parámetros
        return null;
    }
    
    // Constructor que recibe los jugadores necesarios para un ajedrez (dos jugadores)
    public TableroAjedrez(String jugadorUno, String jugadorDos) {
        // Llamo al constructor de la clase padre (Tablero) pasándole la lista de jugadores
        // Creo una lista y le agrego los dos jugadores para el ajedrez
        super(crearListaJugadores(jugadorUno, jugadorDos));
    }
    
    // Método auxiliar para crear la lista con dos jugadores
    private static List<String> crearListaJugadores(String jugadorUno, String jugadorDos) {
        List<String> jugadores = new ArrayList<>();
        jugadores.add(jugadorUno);
        jugadores.add(jugadorDos);
        return jugadores;
    }
}
