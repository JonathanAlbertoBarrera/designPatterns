public class PagoOxxo implements MetodoPago {
    private double num1=0;
    private double num2=0;
    @Override
    public void cobrar() {
        System.out.println("Pago realizado en OXXO.");
        num1=Math.random()*100;
        System.out.println(num1);
        num2=Math.random()*100;
        System.out.println(num2);

    }
}
