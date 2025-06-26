import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Ingresa la longitud en centimetros: ");
            double pies = scanner.nextDouble();
            double cm = pies * 30.48;
            System.out.println(pies + " pies equivale a " + cm + "cm.");
        }
    }
}
