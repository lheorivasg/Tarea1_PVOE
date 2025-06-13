/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;

/**
 *
 * @author Kirig
 */
public class OperacionesLista {

    // Clase interna Nodo
    private class Nodo {
        private Alumno alumno;
        private Nodo siguiente;

        public Nodo(Alumno alumno) {
            this.alumno = alumno;
            this.siguiente = null;
        }

        public Alumno getAlumno() {
            return alumno;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }

    private Nodo cabeza;

    // Método para agregar un alumno a la lista (al principio)
    public void agregar(Alumno alumno) {

    }

    // Buscar alumno por matrícula
    public Alumno buscarPorMatricula(String matricula) {

        return null;
    }

    // Buscar alumnos por licenciatura
    public void buscarPorLicenciatura(String claveLic) {

    }

    // Buscar alumnos por género
    public void buscarPorGenero(String genero) {

    }

    // Eliminar alumno por matrícula
    public boolean eliminarPorMatricula(String matricula) {


        return false;
    }
}

