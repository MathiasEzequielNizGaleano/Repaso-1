import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Ingrese la capacidad del disco en GB: ");
            double gb = scanner.nextDouble();

            double mb = gb * 1024;
            double kb = mb * 1024;
            double bytes = kb * 1024;

            System.out.println("Cacapidad en GB: " + gb);
            System.out.println("Equivale a: ");
            System.out.println("->" + mb + "MB");
            System.out.println("->" + kb + "KB");
            System.out.println("->" + bytes + "BYTES");
        }
    }
}
