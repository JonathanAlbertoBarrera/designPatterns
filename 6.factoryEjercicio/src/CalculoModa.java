public class CalculoModa implements CalculoEstadistico {
    @Override
    public double calcular(double[] numeros) {
        double moda = numeros[0];
        int maxFrecuencia = 0;

        for (int i = 0; i < numeros.length; i++) {
            int frecuencia = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeros[i]) {
                    frecuencia++;
                }
            }
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = numeros[i];
            }
        }
        return moda;
    }
}