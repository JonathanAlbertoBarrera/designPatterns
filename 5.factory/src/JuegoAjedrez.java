public class JuegoAjedrez implements Juego {
    private String jugadorDos;
    
    private String jugadorUno;

    @Override
    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    public JuegoAjedrez(String jugadorUno, String jugadorDos){
        this.jugadorUno=jugadorUno;
        this.jugadorDos=jugadorDos;
    }
    
}
