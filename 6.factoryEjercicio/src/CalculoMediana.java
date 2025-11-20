import java.util.Arrays;

class CalculoMediana implements CalculoEstadistico {
    @Override
    public double calcular(double[] numeros) {
        double[] copia = numeros.clone();
        Arrays.sort(copia);

        int n = copia.length;
        if (n % 2 == 0) {
            return (copia[n / 2 - 1] + copia[n / 2]) / 2.0;
        } else {
            return copia[n / 2];
        }
    }
}