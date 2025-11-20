public class FabricaMediana extends FabricaCalculos {
    @Override
    public CalculoEstadistico crearCalculo() {
        return new CalculoMediana();
    }
}