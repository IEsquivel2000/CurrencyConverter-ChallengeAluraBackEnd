import com.aluracursos.conversormonedas.Conversor;
import com.aluracursos.conversormonedas.Menu;

public class Main {
    public static void main(String[] args) {

        Conversor converter = new Conversor();
        converter.setApiKey("2abd331f8d79a723fe6fd666");

        Menu menu = new Menu(converter);
        try{
            menu.displayMenu();
        }catch (Exception e){
            System.out.println("\nEl monto debe ser numerico, vuelva a intentarlo");
        }

    }
}