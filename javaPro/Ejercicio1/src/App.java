import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            //1. Leer dos numeros, calcular su suma y producto
            System.out.println("Ingrese el numero A:");
            int a = scanner.nextInt();

            System.out.println("Ingrese el numero B:");
            int b = scanner.nextInt();

            int suma = a + b;
            int producto = a * b;

            System.out.println("Suma " + suma);
            System.out.println("Producto: "+ producto);


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
