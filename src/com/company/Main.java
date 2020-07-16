package com.company;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        Alumnos alumnos = new Alumnos();

        int num = -1;

        do {

            System.out.println("Menu:" +
                    "\n1- Mostrar alumnos" +
                    "\n2- Formar grupos" +
                    "\n0- Salir");

            num = input.nextInt();

            switch (num) {

                case 1:
                    alumnos.showAlumnos();
                    break;
                case 2:
                    alumnos.selectGroups();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. Hasta la vista.");
            }

        } while (num != 0);

    }
}
