import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Mostrar usuario activo");
            System.out.println("3. Cerrar sesión");
            System.out.println("4. Salir");
            System.out.println("5. Mostrar mi nombre");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre de usuario: ");
                    String nombre = sc.nextLine();
                    Sesion.iniciarSesion(nombre);
                    break;

                case 2:
                    Sesion.mostrarUsuarioActivo();
                    break;

                case 3:
                    Sesion.cerrarSesion();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                      case 5:
                    System.out.println("Jonaaa Barrera");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
