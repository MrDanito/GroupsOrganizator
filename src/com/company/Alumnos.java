package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alumnos {

    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

    String[] nombres;

    public String[] loadAlumnos() throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("nombres.txt"));
        nombres = new String[lines.size()];
        lines.toArray(nombres);

        Collections.shuffle(Arrays.asList(nombres)); // funciÓn que reordena-baraja el array

        return nombres;

    }

    public void showAlumnos() {
        System.out.println("Estos son los alumnos.");
        System.out.println();

        for (int i = 0; i <= nombres.length - 1; i++) {

            System.out.println(i + 1 + "- " + nombres[i]);

        }// Recorre la lista de alumnos

    }

    public void deleteAlumno() {

        System.out.println("Que alumno esta ausente");

        int aus = teclado.nextInt() - 1;

        String name = nombres[aus];

        System.out.println(name + " está ausente.");

        for (int i = aus; i < (nombres.length - aus) - 1; i++) {

            nombres[i] = nombres[i + 1];

        }

        String[] aux = new String[nombres.length - 1];

        for (int k = 0; k <= aux.length - 1; k++) {
            aux[k] = nombres[k];
        }

        nombres = new String[aux.length];

        nombres = aux;

    }

    public void selectGroups() {

        System.out.println();
        System.out.println("¿De cuánto quieres que sean los grupos? \n2 - 3 - 4 alumnos ");
        System.out.println();
        int numAlum = teclado.nextInt();

        System.out.println("========================================================================================");
        System.out.println("============================..FORMANDO LOS GRUPOS..=====================================");
        System.out.println("========================================================================================");

        System.out.println();

        int numgroups = nombres.length / numAlum;

        switch (numAlum) {

            case 2:

                int contador = 1;
                int aleatorio = random.nextInt(numgroups);
                for (int i = 0; i <= nombres.length - 1; i = i + 2) {

                    if (contador == numgroups+1) {

                        System.out.println(nombres[i] + " te ha tocado en el grupo " + aleatorio);
                        break;
                    }

                    System.out.println("Grupo: " + contador + "- " + nombres[i] + " con --> " + nombres[i + 1]);
                    contador++;
                }
                break;

            case 3:

                contador = 1;
                aleatorio = random.nextInt(numgroups);
                for (int i = 0; i <= nombres.length - 1; i = i + 3) {

                    if (contador == numgroups+1) {

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
                aleatorio = random.nextInt(numgroups);
                for (int i = 0; i <= nombres.length - 1; i = i + 4) {

                    if (contador == numgroups+1) {

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
