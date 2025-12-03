public class ContextoPago {
    
    private MetodoPago metodoPago;
    
    
// Setter para cambiar la estrategia 
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public ContextoPago() {
    }
    
    
    public void procesarPago() {
        if (metodoPago != null) {
            metodoPago.cobrar();
        } else {
            System.out.println("No se ha configurado un método de pago.");
        }
    }
}
