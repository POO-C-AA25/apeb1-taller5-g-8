/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Problema2_SistemaCalificaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = sc.nextLine();

        System.out.print("Ingrese la calificacion ACD (max 3.5): ");
        double acd = sc.nextDouble();

        System.out.print("Ingrese la calificacion APE (max 3.5): ");
        double ape = sc.nextDouble();

        System.out.print("Ingrese la calificacion AA (max 3.0): ");
        double aa = sc.nextDouble();

        Problema2_Estudiante estudiante = new Problema2_Estudiante(nombreEstudiante, edadEstudiante);
        Problema2_Materia materia = new Problema2_Materia(nombreMateria, acd, ape, aa);
        estudiante.asignarMateria(materia);

        if (materia.aprobado()) {
            System.out.println("Estudiante: " + estudiante.getNombre() + "\nEdad: "
                    + estudiante.getEdad() + "\nMateria: " + materia.getNombre()
                    + "\nAPROBADO" + "\nNota final: " + materia.getNotaParcial());
        } else {
            System.out.println("Estudiante: " + estudiante.getNombre() + "\nEdad: "
                    + estudiante.getEdad() + "\nMateria: " + materia.getNombre()
                    + "\nREPROBADO" + "\nNota final: " + materia.getNotaParcial());
            System.out.print("Ingrese nota del examen de recuperación (sobre 3.5 pts): ");
            double notaRecuperacion = sc.nextDouble();
            double notaFinal = materia.getNotaParcial() + notaRecuperacion;
            if (notaFinal >= 7.0) {
                System.out.println("Estado final: APROBADO \nNota final: " + notaFinal);
            } else {
                System.out.println("Estado final: REPROBADO \nNota final: " + notaFinal);
            }
        }

        sc.close();

    }

}
