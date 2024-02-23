/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignatura.Profesor;

import asignatura.Alumno.Alumno;

/**
 *
 * @author José
 */
public class Profesor {
//Métodos getter y otros métodos

    /**
     * Método para poner las notas a los alumnos.
     *
     * @param a el alumno que creamos de la clase Alumno.
     */
    public void ponerNotas(Alumno a) {
        double nota;
        nota = Math.random() * 11;
        nota = nota > 10.0 ? 10.0 : nota;
        a.getAsignatura1().setCalificacion(nota);
        nota = Math.random() * 11;
        nota = nota > 10.0 ? 10.0 : nota;
        a.getAsignatura2().setCalificacion(nota);
        nota = Math.random() * 11;
        nota = nota > 10.0 ? 10.0 : nota;
        a.getAsignatura3().setCalificacion(nota);
    }

    /**
     * Método que calcula la media del alumno introducido por parametro respecto
     * a sus calificaciones en las distintas asignaturas.
     *
     * @param a el alumno del que vamos a realizar la media.
     * @return devuelve la media calculada.
     */
    public double calcularMedia(Alumno a) {
        double media = 0.0;
        media = ((a.getAsignatura1().getCalificacion()
                + a.getAsignatura2().getCalificacion()
                + a.getAsignatura3().getCalificacion()) / 3.0);
        return media;
    }
}
