public class AreaCuadrado implements AreaInterface {
    
    private PulgadasACentimetrosAdapter conversor = new PulgadasACentimetrosAdapter();

    @Override
    public double calcularAreaCuadrado(double ladoPulgadas) {
        double ladoCm = conversor.convertir(ladoPulgadas);
        return ladoCm * ladoCm;
    }

    @Override
    public double calcularAreaTriangulo(double basePulgadas, double alturaPulgadas) {
        // No se usa para el cuadrado, pero debe implementarse
        return 0;
    }
}
