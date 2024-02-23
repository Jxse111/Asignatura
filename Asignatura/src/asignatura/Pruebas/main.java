/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class_1.java to edit this template
 */
package asignatura.Pruebas;

/**
 *
 * @author maniana
 */
import asignatura.Alumno.Alumno;
import asignatura.Asignatura;
import asignatura.Profesor.Profesor;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        Asignatura mates, lengua, ingles;
        Alumno alumno1;
        Profesor profe1;
        // Variables de salida
        // Variables auxiliares
        //para calculos intermedios
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("PLANTILLA EJEMPLO");
        System.out.println("----------------------");
        System.out.println(" ");
        mates = new Asignatura();
        lengua = new Asignatura();
        ingles = new Asignatura();
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        alumno1 = new Alumno();
        profe1 = new Profesor();
        profe1.ponerNotas(alumno1);
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.printf("La asignatura 1 tiene: %.2f\n", alumno1.getAsignatura1().getCalificacion());
        System.out.printf("La asignatura 2 tiene: %.2f\n", alumno1.getAsignatura2().getCalificacion());
        System.out.printf("La asignatura 3 tiene: %.2f\n", alumno1.getAsignatura3().getCalificacion());

        System.out.printf("La media del alumno es de %.1f\n", profe1.calcularMedia(alumno1));
        System.out.println("Fin del programa.");
    }
}
