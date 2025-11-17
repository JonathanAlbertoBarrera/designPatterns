public class Sesion {

    private static Sesion instancia;

    private String usuario;

    private Sesion(String usuario) {
        this.usuario = usuario;
    }

    public static Sesion iniciarSesion(String usuario) {
        if (instancia == null) {
            instancia = new Sesion(usuario);
            System.out.println("Sesión iniciada correctamente por: " + usuario);
        } else {
            System.out.println("Ya existe una sesión activa con el usuario: " + instancia.usuario);
        }
        return instancia;
    }


    public String getUsuario() {
        return usuario;
    }


    public static void mostrarUsuarioActivo() {
        if (instancia == null) {
            System.out.println("No hay ninguna sesión activa.");
        } else {
            System.out.println("Usuario activo: " + instancia.usuario);
        }
    }


    public static void cerrarSesion() {
        if (instancia == null) {
            System.out.println("No hay ninguna sesión iniciada.");
        } else {
            System.out.println("Sesión cerrada para el usuario: " + instancia.usuario);
            instancia = null;
        }
    }
}
