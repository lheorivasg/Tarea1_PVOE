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
        Nodo nuevoNodo = new Nodo(alumno);
        if (cabeza == null) {      //insertamos 1er alumno (no hay nada en la cabeza)
            cabeza = nuevoNodo;         //1er nodo d la lista
        } else {                    //ya tiene elementos la lista (se meteran al final d la lista los alumnos)
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);     // enlaza al final
        }
    }


    // Buscar alumno por matrícula
   public Alumno buscarPorMatricula(String matricula) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getAlumno().getMatricula().equals(matricula)) {
                return actual.getAlumno();
            }
            actual = actual.getSiguiente();
        }
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
       if (cabeza == null) {                //en caso de que se proporcione una lista sin nada
           System.out.println("La lista está vacía.");
           return false;
       }
        // Caso mas facil : alumno al principio de la lista
        if (cabeza.getAlumno().getMatricula().equals(matricula)) {
            cabeza = cabeza.getSiguiente(); // Se elimina el primer nodo(cabeza)
            return true;                //(si se eliminó al alumno)
        }
    // Recorremos la lista buscando al alumno
    Nodo actual = cabeza;
    while (actual.getSiguiente() != null) {         //mientras haya alumnos en la lista
        if (actual.getSiguiente().getAlumno().getMatricula().equals(matricula)) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente()); // Se elimina el nodo
            return true;            //(si se eliminó al alumno)
        }
        actual = actual.getSiguiente();
    }
    //el alumno no existe
    return false;
}

}

