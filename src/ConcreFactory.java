public class ConcreFactory extends AbstractFactory{
    IPay metodoPago = null;
    @Override
    public IPay canalPago(int opcionPago) {
       switch (opcionPago){
           case 1: {metodoPago = new PagoPSE(); break;}
           case 2:{metodoPago = new PagoWompi(); break;}
           case 3:{metodoPago = new PagoBancolombia(); break;}
           case 4:{metodoPago = new PagoOtro(); break;}
       }
       return metodoPago;
    }
}
