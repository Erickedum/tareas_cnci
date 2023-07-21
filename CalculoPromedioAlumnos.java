import java.util.Scanner;

public class CalculoPromedioAlumnos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int numAlumnos = 30;
        final int numMaterias = 5;
        final double calificacionAprobacion = 7.0;

        String[] materias = { "matemáticas", "español", "geografía", "ciencias", "educación física" };
        double[][] calificaciones = new double[numAlumnos][numMaterias];

        // Obtener las calificaciones de cada alumno en cada materia
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Alumno #" + (i + 1));
            for (int j = 0; j < numMaterias; j++) {
                System.out.print("Ingresa la calificación de " + materias[j] + ": ");
                calificaciones[i][j] = input.nextDouble();
            }
            System.out.println(); // Espacio para separar los datos de cada alumno
        }

        // Calcular el promedio por alumno y mostrar si aprobó o reprobó
        System.out.println("RESULTADOS:");
        for (int i = 0; i < numAlumnos; i++) {
            double sumaCalificaciones = 0;
            for (int j = 0; j < numMaterias; j++) {
                sumaCalificaciones += calificaciones[i][j];
            }

            double promedio = sumaCalificaciones / numMaterias;
            String estado = promedio >= calificacionAprobacion ? "APROBADO" : "REPROBADO";

            System.out.println("Alumno #" + (i + 1) + " - Promedio: " + promedio + " - Estado: " + estado);
        }

        input.close();
    }
}
