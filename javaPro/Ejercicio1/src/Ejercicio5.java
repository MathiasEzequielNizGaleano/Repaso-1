import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //5. CONVERTIR UNA TEMPERATURA DADA EN LA ESCALA CELSIUS EN IMPRIMIR SU EQUIVALENTE EN fahrenheit. F=9/5*C+32

            System.out.println("\nIngrese temperatura en Celsius:");
            double cel = scanner.nextDouble();
            double fah = (9.0 / 5) * cel + 32;
            System.out.println("Temperatura en Fahrenheit: " + fah);
        }
    }
}
