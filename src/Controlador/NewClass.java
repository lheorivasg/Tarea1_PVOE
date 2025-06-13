/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Kirig
 */
public class NewClass {
    import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opción 4");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para la opción 1
                    break;
                case 2:
                    // Lógica para la opción 2
                    break;
                case 3:
                    // Lógica para la opción 3
                    break;
                case 4:
                    // Lógica para la opción 4
                    break;
                case 5:
                    salir();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void salir() {
        System.out.println("Adios");
        System.exit(0);
    }
}

}
