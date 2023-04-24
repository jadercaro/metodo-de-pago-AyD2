public class PagoOtro implements IPay{
    @Override
    public void realizarPago() {
        System.out.println("Estoy pagando con otro método de pago");
    }
}
