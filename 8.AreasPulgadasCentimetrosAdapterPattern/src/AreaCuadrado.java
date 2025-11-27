public class AreaCuadrado implements AreaInterface {

    @Override
    public double calcularAreaCuadrado(double ladoCm) {
        return ladoCm * ladoCm;
    }

    @Override
    public double calcularAreaTriangulo(double basePulgadas, double alturaPulgadas) {
        // No se usa para el cuadrado, pero debe implementarse
        return 0;
    }
}
