public class PulgadasACentimetrosAdapter {
    private static final double FACTOR_CONVERSION = 2.54;
    
    public double convertir(double pulgadas) {
        return pulgadas * FACTOR_CONVERSION;
    }
}
