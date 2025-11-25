import java.util.List;

public class CalculoInverso implements CalculoEstadistico {
    @Override
    public double calcular(double[] numeros) {
        // Este método retorna -1 para indicar que no aplica
        // El cálculo real se hace en calcularInverso()
        return -1;
    }
    
    public List<Double> calcularInverso(double[] numeros) {
        java.util.List<Double> resultado = new java.util.ArrayList<>();
        for (int i = numeros.length - 1; i >= 0; i--) {
            resultado.add(numeros[i]);
        }
        return resultado;
    }
}
