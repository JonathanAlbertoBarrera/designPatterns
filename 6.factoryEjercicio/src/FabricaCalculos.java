public abstract class FabricaCalculos {
    public abstract CalculoEstadistico crearCalculo();
    
    // Método para realizar el cálculo
    public double ejecutarCalculo(double[] numeros) {
        CalculoEstadistico calculo = crearCalculo();
        return calculo.calcular(numeros);
    }
}