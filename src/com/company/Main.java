package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        String[] nombres = new String[25];

        Files.readAllLines(Paths.get("nombres.txt")).toArray(nombres);

        System.out.println("Estos son los alumnos.");

        for (int i = 0; i <= nombres.length - 1; i++) {

            System.out.println(i + 1 + "- " + nombres[i]);

        }// Recorre la lista de alumnos


        System.out.println();
        System.out.println("¿De cuánto quieres que sean los grupos? \n2 - 3 - 4 alumnos ");
        System.out.println();
        int numAlum = teclado.nextInt();

        Collections.shuffle(Arrays.asList(nombres)); // funciÓn que reordena-baraja el array

        System.out.println("========================================================================================");
        System.out.println("============================..FORMANDO LOS GRUPOS..=====================================");
        System.out.println("========================================================================================");

        System.out.println();

        switch (numAlum) {

            case 2:

                int contador = 1;
                int aleatorio = random.nextInt(12);
                for (int i = 0; i <= nombres.length - 1; i = i + 2) {

                    if (contador == 13) {

                        System.out.println(nombres[i] + " te ha tocado en el grupo " + aleatorio);
                        break;
                    }

                    System.out.println("Grupo: " + contador + "- " + nombres[i] + " con --> " + nombres[i + 1]);
                    contador++;
                }
                break;

            case 3:

                contador = 1;
                aleatorio = random.nextInt(8);
                for (int i = 0; i <= nombres.length - 1; i = i + 3) {

                    if (contador == 9) {

                        System.out.println(nombres[i] + " te ha tocado en el grupo " + aleatorio);
                        break;
                    }

                    System.out.println("Grupo: " + contador + "- " + nombres[i] + " con --> " + nombres[i + 1] +
                            " y con --> " + nombres[i + 2]);

                    contador++;
                }
                break;

            case 4:

                contador = 1;
                aleatorio = random.nextInt(6);
                for (int i = 0; i <= nombres.length - 1; i = i + 4) {

                    if (contador == 7) {

                        System.out.println(nombres[i] + " te ha tocado en el grupo " + aleatorio);
                        break;
                    }

                    System.out.println("Grupo: " + contador + "- " + nombres[i] + " con --> " + nombres[i + 1] +
                            " y con --> " + nombres[i + 2] + " y con --> " + nombres[i + 3]);
                    contador++;
                }

                break;
        } //fin switch

    }
}
