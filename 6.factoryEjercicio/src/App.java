import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar cantidad de datos al usuario
        System.out.print("Cuántos datos deseas ingresar? ");
        int n = scanner.nextInt();
        
        // arreglo para almacenar los datos
        double[] datos = new double[n];
        
        
        System.out.println("Ingresa los " + n + " datos:");
        for (int i = 0; i < n; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            datos[i] = scanner.nextDouble();
        }
        
        // Mostrar los datos ingresados
        System.out.println("\nDatos ingresados: " + Arrays.toString(datos));
        
        FabricaCalculos fabricaMedia = new FabricaMedia();
        FabricaCalculos fabricaMediana = new FabricaMediana();
        FabricaCalculos fabricaModa = new FabricaModa();
        
        // Usar cada factory para crear y ejecutar los cálculos
        CalculoEstadistico calculoMedia = fabricaMedia.crearCalculo();
        double resultadoMedia = calculoMedia.calcular(datos);
        System.out.printf("Media: %.2f\n", resultadoMedia);
        
        CalculoEstadistico calculoMediana = fabricaMediana.crearCalculo();
        double resultadoMediana = calculoMediana.calcular(datos);
        System.out.printf("Mediana: %.2f\n", resultadoMediana);
                
        CalculoEstadistico calculoModa = fabricaModa.crearCalculo();
        double resultadoModa = calculoModa.calcular(datos);
        System.out.printf("Moda: %.2f\n", resultadoModa);
        
        FabricaCalculos fabricaInverso = new FabricaInverso();
        CalculoInverso calculoInverso = (CalculoInverso) fabricaInverso.crearCalculo();
        List<Double> resultadoInverso = calculoInverso.calcularInverso(datos);
        System.out.println("Lista invertida: " + resultadoInverso);
        
        scanner.close();
    }
}
