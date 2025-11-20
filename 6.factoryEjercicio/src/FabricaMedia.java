public class FabricaMedia extends FabricaCalculos {
    @Override
    public CalculoEstadistico crearCalculo() {
        return new CalculoMedia();
    }
}