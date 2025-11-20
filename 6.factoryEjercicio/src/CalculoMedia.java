public class CalculoMedia implements CalculoEstadistico {
    @Override
    public double calcular(double[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }
}