public class FabricaInverso extends FabricaCalculos {
    @Override
    public CalculoEstadistico crearCalculo() {
        return new CalculoInverso();
    }
}
