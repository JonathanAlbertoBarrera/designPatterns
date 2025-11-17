import java.util.Scanner;

public class clienteSingleton {
    public static void main(String[] args) throws Exception {
    
        System.out.println("--------------");
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingresa 10 números blo:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        // Obtener la instancia única
        Calculadora calculadora = Calculadora.getInstance();

        // Calcular los resultados
        double promedio = calculadora.calcularPromedio(numeros);
        double mediana = calculadora.calcularMediana(numeros);
        double moda = calculadora.calcularModa(numeros);


        System.out.println("\nResultados:");
        System.out.println("----Promedio: " + promedio);
        System.out.println("-----Mediana: " + mediana);
        System.out.println("--Moda: " + moda);
    }
}
