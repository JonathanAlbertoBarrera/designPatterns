import java.util.Scanner;

public class AdapterClient {

    private static final double FACTOR_CONVERSION = 2.54;
    private AreaInterface areaCuadrado;
    private AreaInterface areaTriangulo;

    public AdapterClient(AreaInterface areaCuadrado, AreaInterface areaTriangulo) {
        this.areaCuadrado = areaCuadrado;
        this.areaTriangulo = areaTriangulo;
    }

    private double convertirPulgadasACentimetros(double pulgadas) {
        return pulgadas * FACTOR_CONVERSION;
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

        // Dividir entre 6
        ladoCuadrado = -ladoCuadrado / 6;
        baseTriangulo = -baseTriangulo / 6;
        alturaTriangulo = -alturaTriangulo / 6;
        
        double ladoCuadradoCm = convertirPulgadasACentimetros(ladoCuadrado);
        double baseTrianguloCm = convertirPulgadasACentimetros(baseTriangulo);
        double alturaTrianguloCm = convertirPulgadasACentimetros(alturaTriangulo);
        
        // Calcular áreas con valores en centímetros
        double resultadoCuadrado = areaCuadrado.calcularAreaCuadrado(ladoCuadradoCm);
        double resultadoTriangulo = areaTriangulo.calcularAreaTriangulo(baseTrianguloCm, alturaTrianguloCm);
        
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("Área del cuadrado: %.2f cm²\n", resultadoCuadrado);
        System.out.printf("Área del triángulo: %.2f cm²\n", resultadoTriangulo);
        
        scanner.close();
    }
}
