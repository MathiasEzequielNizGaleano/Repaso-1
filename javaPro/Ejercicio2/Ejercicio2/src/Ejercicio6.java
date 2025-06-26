import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Calculo de pintura");
            System.out.println("Alutra de la pared (en metros): ");
            double altura = scanner.nextDouble();
            System.out.println("Largode la pared (en metros): ");
            double largo = scanner.nextDouble();
            double area = altura * largo;

            double litrosNecesarios = area / (3.6 / 0.5);
            System.out.println("Area de la pared" + area + " m2");
            System.out.println("Litros de pintura necesarios: " + litrosNecesarios + "L");

        }
    }
}
