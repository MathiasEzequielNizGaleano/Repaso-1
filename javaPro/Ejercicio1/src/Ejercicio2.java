import java.util.Scanner;

public class Ejercicio2 {
        public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            //2. LEER DOS VALORES DE BASE Y ALTURA DE UN RECTAGULO. INFORMAR EL AREA Y PERIMETRO
            System.out.println("Ingrese la Base: ");
            double base = scanner.nextInt();
            System.out.println("Ingrese la altura:");
            double altura = scanner.nextInt();

            double perimetro = 2*(base + altura);
            double area = base * altura;

            System.out.println("Perimetro: " + perimetro);
            System.out.println("Area: " + area);
        }
        
    }
}
