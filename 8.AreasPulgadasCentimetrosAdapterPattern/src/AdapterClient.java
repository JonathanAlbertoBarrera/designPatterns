import java.util.Scanner;

public class AdapterClient {

    private AreaInterface areaCuadrado;
    private AreaInterface areaTriangulo;

    public AdapterClient(AreaInterface areaCuadrado, AreaInterface areaTriangulo) {
        this.areaCuadrado = areaCuadrado;
        this.areaTriangulo = areaTriangulo;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA DE AREAS ===");
        System.out.println("Ingrese las medidas en PULGADAS:");
        
        System.out.print("Lado del cuadrado: ");
        double ladoCuadrado = scanner.nextDouble();
        
        System.out.print("Base del triángulo: ");
        double baseTriangulo = scanner.nextDouble();
        
        System.out.print("Altura del triángulo: ");
        double alturaTriangulo = scanner.nextDouble();

        // areas usando los adaptadores
        double resultadoCuadrado = areaCuadrado.calcularAreaCuadrado(ladoCuadrado);
        double resultadoTriangulo = areaTriangulo.calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("Área del cuadrado: %.2f cm²\n", resultadoCuadrado);
        System.out.printf("Área del triángulo: %.2f cm²\n", resultadoTriangulo);
        
        scanner.close();
    }
}
