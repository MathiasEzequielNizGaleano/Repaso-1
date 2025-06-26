import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
    // 4. EN UNA COMPETENCIA ATLETICA DE VELOCIDAD. EL TIEMPO SE MIDE EN MIN, SEG, CENTESIMAS DE SEGUNDOS, Y EL ESPACIO SE MIDE EN METROS. DISEÑE UN ALGORTIMO PARA 
    //    DETERMINAR LA VELOCIDAD PROMEDIO DE UN ATLETA EN KM/H

     try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("===Velocidad Promedio===");
        System.out.println("Ingrese la distancia recorrida (en metros): ");
        double metros = scanner.nextDouble();

        System.out.println("Minutos: ");
        int min = scanner.nextInt();
        System.out.println("Segundos: ");
        int seg = scanner.nextInt();
        System.out.println("Centesimas de segundo: ");
        int cseg = scanner.nextInt();

        double totalSegundos = min * 60 + seg + cseg / 100.0;
        double horas = totalSegundos / 3600.0;
        double km = metros / 1000.0;
        double velocidad = km / horas;
        System.out.println("Velocidad promedio: " + velocidad + " km/h");
        
    }
}
}
