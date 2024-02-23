/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignatura.Alumno;

import asignatura.Asignatura;

/**
 *
 * @author José
 */
public class Alumno {

    //Métodos de objeto
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;

    //Constructor/es
    /**
     * Constructor de la clase Alumno que crea 3 asignaturas una con el
     * constructor sin parametros de la clase Asignatura y dos con el constructo
     * copia de la misma clase.
     */
    public Alumno() {
        asignatura1 = new Asignatura();
        asignatura2 = new Asignatura(asignatura1);
        asignatura3 = new Asignatura(asignatura1);
    }

    //Métodos getter y otros métodos
    /**
     * Método get de la asignatura1.
     *
     * @return devuelve la asignatura1.
     */
    public Asignatura getAsignatura1() {
        return this.asignatura1;
    }

    /**
     * Método get de la asignatura2.
     *
     * @return devuelve la asignatura2.
     */
    public Asignatura getAsignatura2() {
        return this.asignatura2;
    }

    /**
     * Método get de la asignatura2.
     *
     * @return devuelve la asignatura2.
     */
    public Asignatura getAsignatura3() {
        return this.asignatura3;
    }

}
