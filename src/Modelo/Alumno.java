/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Kirig
 */
public class Alumno {
    String matricula;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String licenciatura;
    String genero;

    public Alumno() {
    }

    public Alumno(String matricula, String nombre, String apellidoPaterno, String apellidoMaterno, String licenciatura, String genero) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.licenciatura = licenciatura;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Alumno{" + "matricula=" + matricula + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", licenciatura=" + licenciatura + ", genero=" + genero + '}';
    }
    
    
    
    
}
