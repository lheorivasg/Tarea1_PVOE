/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Kirig
 */
import java.io.*;
import java.util.Scanner;
import Modelo.Alumno;
import Controlador.OperacionesLista;

public class Main {
    public static void main(String[] args) {
        OperacionesLista lista = new OperacionesLista();
        Scanner sc = new Scanner(System.in);

        // Cargar datos del archivo
        try (BufferedReader br = new BufferedReader(new FileReader("alumnos.dat"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                Alumno a = new Alumno(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5]);
                lista.agregar(a);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Menú
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Buscar por matrícula");
            System.out.println("2. Buscar por licenciatura");
            System.out.println("3. Buscar por género");
            System.out.println("4. Borrar por matrícula");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese matrícula: ");
                    String mat = sc.nextLine();
                    Alumno encontrado = lista.buscarPorMatricula(mat);
                    if (encontrado != null)
                        System.out.println(encontrado);
                    else
                        System.out.println("Alumno no encontrado.");
                    break;
                case 2:
                    System.out.print("Ingrese clave de licenciatura: ");
                    String lic = sc.nextLine();
                    lista.buscarPorLicenciatura(lic);
                    break;
                case 3:
                    System.out.print("Ingrese género (M o F): ");
                    String gen = sc.nextLine();
                    lista.buscarPorGenero(gen);
                    break;
                case 4:
                    System.out.print("Ingrese matrícula a borrar: ");
                    String borrar = sc.nextLine();
                    if (lista.eliminarPorMatricula(borrar))
                        System.out.println("Alumno eliminado.");
                    else
                        System.out.println("Alumno no encontrado.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
