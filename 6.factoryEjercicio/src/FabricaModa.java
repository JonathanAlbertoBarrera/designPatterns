class FabricaModa extends FabricaCalculos {
    @Override
    public CalculoEstadistico crearCalculo() {
        return new CalculoModa();
    }
}