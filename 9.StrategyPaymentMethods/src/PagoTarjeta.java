public class PagoTarjeta implements MetodoPago {

    
    
    @Override
    public void cobrar() {
        System.out.println("Pago realizado con Tarjeta de crédito/débito.");
    }
}
