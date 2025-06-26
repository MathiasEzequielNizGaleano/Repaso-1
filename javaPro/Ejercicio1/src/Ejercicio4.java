
import java.util.Scanner;

public class Ejercicio4 {
      public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            //4. CALCULAR EL SALARIO DE UNA PERSONA A PARTIR DE LA LECTURA DE NOMBRE, HORAS TRABAJADAS, PRECIO POR HORA. INFORMAR NOMBRE, HORAS TRABAJADAS, SUELDO BRUTO Y NETO.

            System.out.println("Ingrese el nombre de un trabajador: ");
            String tra1 = scanner.nextLine();
            System.out.println("Ingrese las horas trabajadas: ");
            double horastra1 = scanner.nextInt();
            System.out.println("Ingrese el precio por hora del trabajador: ");
            double phtra1 = scanner.nextInt();

            double sueldo = horastra1 * phtra1;

            System.out.println("Nombre: " + tra1);
            System.out.println("Horas de trabajo: " + horastra1);
            System.out.println("Sueldo: " + sueldo);
        }

       
    }
}