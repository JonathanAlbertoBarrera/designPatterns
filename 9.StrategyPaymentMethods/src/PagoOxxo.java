public class PagoOxxo implements MetodoPago {
    
    @Override
    public void cobrar() {
        System.out.println("Pago realizado en OXXO.");
    }
}
