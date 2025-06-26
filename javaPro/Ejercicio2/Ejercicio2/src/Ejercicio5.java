import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        try(Scanner scanner = new  Scanner(System.in)){
            // 5. EN PAISES DE HABLA INGLESA LA ESTATURA DE UNA PERSONA SE EXPRESA EN UNA CANTIDAD ENTERA PIES MAS UNA CANTIDAD ENTERA EN PULGADAS.. 
            // EJEMPLO_ LA ALTURA DE UNA PERSONA ES 5 PIES Y 8 PULG. DISEÑE UN ALGORITMO QUE DETERMINE LA ALTURA EN METROS CONOCIENDO LA ESTATURA EN FORMATO INGLES. 
            // CONSIDERE  1 PIES ES 12 PULG, 1 PULG ES 2,54 CM, Y 1M ES 100 CM


            System.out.println("=== Conversion de Estatura ===");
            System.out.println("Ingrese los pies: ");
            int pies = scanner.nextInt();
            System.out.println("Ingrese las pulgadas: ");
            int pulgadas = scanner.nextInt();

            int totalPulgadas = pies * 12 + pulgadas;
            double cm = totalPulgadas * 2.54;
            double metrosEstatura = cm / 100.0;

            System.out.println("Estatura en metros: " + metrosEstatura + " m");
        }
    }
}
