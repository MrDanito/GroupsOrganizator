package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    Alumnos alumnos = new Alumnos();

    public void menu() throws IOException {

        Menu m = new Menu();

        alumnos.loadAlumnos();

        int num = -1;

        do {

            System.out.println("Menu:" +
                    "\n1- Mostrar alumnos" +
                    "\n2- Formar grupos" +
                    "\n3- Ausencia Alumno" +
                    "\n4- Recargar alumnos" +
                    "\n0- Salir");

            num = input.nextInt();

            switch (num) {

                case 1:
                    alumnos.showAlumnos();
                    break;
                case 2:
                    alumnos.selectGroups();
                    break;
                case 3:
                    alumnos.deleteAlumno();
                    break;
                case 4:
                    alumnos.loadAlumnos();
                    break;
                case 5:
                    m.clearConsole();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. Hasta la vista.");
            }

        } while (num != 0);
    }

    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
    }

}
