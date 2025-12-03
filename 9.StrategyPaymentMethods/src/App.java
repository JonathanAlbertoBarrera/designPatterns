public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== SISTEMA DE PAGOS - PATRÓN STRATEGY ===\n");
        
        // Crear el contexto
        ContextoPago contexto = new ContextoPago();
        
        // Crear estrategia de tarjeta
        MetodoPago strategyTarjeta = new PagoTarjeta();

        contexto.setMetodoPago(strategyTarjeta);
        
        // Procesar pago con tarjeta
        System.out.println("1. Pago con Tarjeta:");
        contexto.procesarPago();
        
        
        // OXXO
        MetodoPago pagoOxxo=new PagoOxxo();
        contexto.setMetodoPago(pagoOxxo);
        System.out.println("2. Pago en OXXO:");
        contexto.procesarPago();
        
        
        // Transferencia
        MetodoPago pagoTransferencia=new PagoTransferencia();
        contexto.setMetodoPago(pagoTransferencia);
        System.out.println("3. Pago por Transferencia:");
        contexto.procesarPago();
    }
}
