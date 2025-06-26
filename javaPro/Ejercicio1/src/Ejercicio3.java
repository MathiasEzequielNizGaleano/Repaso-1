
import java.util.Scanner;

public class Ejercicio3 {
      public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            //3. SE LEE 3 VALORES, ABC, HALLAR EL PROMEDIO DE ESTOS E INFORMAR LOS 3 VALORES Y SU PROMEDIO
            System.out.println("Ingrese el valor de A: ");
            int a = scanner.nextInt();
            System.out.println("Ingrese el valor de B: ");
            int b = scanner.nextInt();
            System.out.println("Ingrese el valor de C: ");
            int c = scanner.nextInt();

            double abc= (a+b+c)/3;

            System.out.println("El promedio de abc: " + abc);
        }

       
    }
}
