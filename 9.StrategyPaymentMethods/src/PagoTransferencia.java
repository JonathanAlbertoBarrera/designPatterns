public class PagoTransferencia implements MetodoPago {
    
    @Override
    public void cobrar() {
        System.out.println("Pago realizado por Transferencia bancaria.");
    }
}
