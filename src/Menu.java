import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int opcion() {
        int opcion=0;
        boolean continua;
        do {
            try {
                continua=false;
                System.out.println("Bienvenido al menú principal de la FactoryPay \n" +
                        "Ingrese únicamente el digito del método de pago con cual desea realizar su método de pago:\n" +
                        "1) Pagos con PSE\n" +
                        "2) Pagos con Wompi\n" +
                        "3) Pagos con Bancolombia\n" +
                        "4) Pagos con otro método de pago\n" +
                        "Su opción es: ");
                opcion = (new Scanner(System.in)).nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Ingresar por favor un caracter númerico.");
                continua = true;
            }


        } while (continua);
        return opcion;
    }
}
