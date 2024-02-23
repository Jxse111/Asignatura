/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignatura;

/**
 *
 * @author José
 */
public class Asignatura {

    //Atributos de objeto privados mutables
    private int identificador;
    private double calificacion;
    private int id = 1;

    //Contructor/es
    /**
     * Constructor sin parametros que recibe un id para la asignatura que se
     * asocia de manera automatica.
     */
    public Asignatura() {
        this.identificador = id;
        id++;
    }

    /**
     * Constructor copia que recibe un parámetro de su propio tipo Asignatura
     *
     * @param asignatura1 el parámetro de tipo clase que se le pasa al
     * constructor.
     */
    public Asignatura(Asignatura asignatura1) {
        this.identificador = asignatura1.id;
        id++;

    }

    //Métodos getter y otros métodos
    /**
     * Método get del identificador
     *
     * @return devuelve el identificador
     */
    public int getIdentificador() {
        return this.identificador;
    }

    /**
     * Método get de la calificación
     *
     * @return devuelve la calificacion
     */
    public double getCalificacion() {
        return this.calificacion;
    }

    /**
     * Método set para la calificacion
     *
     * @param calificacion la calificacion que se va a asignar cuando se invoque
     * el metodo en la clase de pruebas
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

}
