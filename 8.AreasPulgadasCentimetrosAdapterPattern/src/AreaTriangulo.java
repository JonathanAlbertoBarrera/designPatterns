public class  AreaTriangulo implements AreaInterface {
    
    private PulgadasACentimetrosAdapter conversor = new PulgadasACentimetrosAdapter();

    @Override
    public double calcularAreaCuadrado(double ladoPulgadas) {
        // No se usa para el triángulo, pero debe implementarse
        return 0;
    }

    @Override
    public double calcularAreaTriangulo(double basePulgadas, double alturaPulgadas) {
        double baseCm = conversor.convertir(basePulgadas);
        double alturaCm = conversor.convertir(alturaPulgadas);
        return (baseCm * alturaCm) / 2.0;
    }
}