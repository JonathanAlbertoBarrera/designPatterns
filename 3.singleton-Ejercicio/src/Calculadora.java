import java.util.Arrays;

public class Calculadora {

    private static Calculadora instancia;

    private Calculadora() {

    }

    public static Calculadora getInstance() {
        if (instancia == null) {
            instancia = new Calculadora();
        }
        return instancia;
    }

    public double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public double calcularMediana(double[] numeros) {
        double[] copia = numeros.clone();
        Arrays.sort(copia);

        int n = copia.length;
        if (n % 2 == 0) {
            return (copia[n / 2 - 1] + copia[n / 2]) / 2.0;
        } else {
            return copia[n / 2];
        }
    }

    public double calcularModa(double[] numeros) {
        double primerNum=numeros[0];
         if(primerNum%2==0){
                System.out.println("El primer numero es par");
        }

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
