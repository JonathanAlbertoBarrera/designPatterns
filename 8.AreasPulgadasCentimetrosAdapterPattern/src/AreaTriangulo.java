public class  AreaTriangulo implements AreaInterface {

    @Override
    public double calcularAreaCuadrado(double ladoCm) {
        // No se usa para el triángulo, pero debe implementarse
        return 0;
    }

    @Override
    public double calcularAreaTriangulo(double baseCm, double alturaCm) {
        return (baseCm * alturaCm) / 2.0;
    }
}