import java.util.ArrayList;
import java.util.List;

// Esta clase extiende de Tablero y es la encargada de crear un juego de solitario
// Implemento el Factory Method para crear instancias específicas de JuegoSolitario
public class TableroSolitario extends Tablero {
    
    // Este es mi Factory Method que crea un juego específico (Solitario)
    // Sobrescribo el método abstracto de la clase padre Tablero
    @Override
    public Juego crearJuego() {
        // Aquí creo y retorno una instancia de JuegoSolitario
        // Por ahora retorno null, pero debería recibir el jugador como parámetro
        return null;
    }
    
    // Constructor que recibe los jugadores necesarios para un solitario (solo uno)
    public TableroSolitario(String jugador) {
        // Llamo al constructor de la clase padre (Tablero) pasándole la lista de jugadores
        // Como solo tengo un jugador, creo una lista y le agrego ese único jugador
        super(crearListaJugadores(jugador));
    }
    
    // Método auxiliar para crear la lista con un jugador
    private static List<String> crearListaJugadores(String jugador) {
        List<String> jugadores = new ArrayList<>();
        jugadores.add(jugador);
        return jugadores;
    }
}
