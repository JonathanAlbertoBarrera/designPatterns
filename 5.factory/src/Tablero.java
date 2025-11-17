import java.util.List;

// Esta es mi clase abstracta que representa un Tablero genérico
// Implementa el patrón Factory Method donde crearJuego() es el método factory
public abstract class Tablero {
    // Aquí guardo la referencia al juego que se está jugando en este tablero
    private Juego juego;
    
    // Aquí mantengo la lista de jugadores que participan en el juego
    private List<String> jugadores;

    // Este es mi Factory Method (método de fábrica) abstracto
    // Las subclases concretas (TableroSolitario, TableroAjedrez) deben implementarlo
    // para crear el tipo específico de juego que corresponda
    public abstract Juego crearJuego();

    // Método para obtener la lista de jugadores del tablero
    public List<String> getJugadores() {
        return jugadores;
    }
    
    // Método para inicializar el tablero
    // Aquí llamo al Factory Method para crear el juego específico
    public void inicializar() {
        // Llamo a crearJuego() que será implementado por las subclases
        this.juego = crearJuego();
    }
    
    // Constructor que recibe la lista de jugadores
    public Tablero(List<String> jugadores) {
        this.jugadores = jugadores;
    }
}
