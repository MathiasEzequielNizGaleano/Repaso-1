
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Ingrese la longitud en centimetros: ");
            double cm = scanner.nextDouble();
            double pies = cm / 30.48;
            System.out.println(cm + " cm equivale a "+ pies + " pies.");
        }
    }
}
