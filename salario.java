import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del trabajador:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese edad del trabajador:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese salario inicial del trabajador:");
        double salarioInicial = scanner.nextDouble();

        double sueldoFinal = calcularSueldoFinal(edad, salarioInicial);

        System.out.println("Nombre del trabajador: " + nombre);
        System.out.println("Edad del trabajador: " + edad);
        System.out.println("Salario inicial: $" + salarioInicial);
        System.out.println("Sueldo final: $" + sueldoFinal);
    }

    public static double calcularSueldoFinal(int edad, double salarioInicial) {
        if (edad < 17) {
            return 0; // No tiene edad para trabajar
        } else if (edad >= 18 && edad <= 45) {
            return salarioInicial * 1.05; // Salario aumentado en un 5%
        } else if (edad >= 46 && edad <= 60) {
            return salarioInicial * 1.15; // Salario aumentado en un 15%
        } else {
            return salarioInicial; // Edad fuera de los rangos, el salario no cambia
        }
    }
}
