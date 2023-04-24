// codigo hecho por @NetTeam-Jader Caro-Dorian Jaramillo-Jhon Usuga
public class Cliente {
    public static void main(String[] args) {
        ConcreFactory metodoDePago = new ConcreFactory();
        try{
        metodoDePago.canalPago(Menu.opcion()).realizarPago();}
        catch(NullPointerException ex){
            System.out.println("Acabaste de ingresar una opción inválida, vuelva pronto");
        }
    }
}