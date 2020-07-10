package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        String[] nombres = new String[]{
                "Daniel G", "Abraham Dangond", "Addy Marquez", "Adrian" , "Cristina Ortega", "Daniel" , "Daniel Ponz",
                "Daniel Sanchez", "Daniel Luna", "Dario Huerta", "Dayana Vila", "Gonzalo PG", "Houda", "Jeniffer",
                "Jeyson Olaes", "Jorge Moya", "Josue", "Lorin Muresan", "Melissah", "Miriam", "Oriana Olivo", "Saul", "Silvia",
                "Victor", "Victor Garcia Dobon"
        };

        System.out.println("Estos son los alumnos.");

        for (int i = 0 ; i<= nombres.length-1; i++){

            System.out.println(i+1 + "- " + nombres[i]);

        }

        System.out.println("¿De cuanto quieres que sean los grupos?");

        Collections.shuffle(Arrays.asList(nombres));

        System.out.println("====================================================================================");
        System.out.println("======================..HACIENDO LOS GRUPOS..=======================================");
        System.out.println("====================================================================================");

        int contador= 1;
        int aleatorio = random.nextInt(12);
        for (int i = 0 ; i<= nombres.length-1; i= i+2){

            if (contador == 13){

                System.out.println( nombres[i] + " te ha tocado en el grupo " + aleatorio);
                break;
            }

            System.out.println("Grupo: " + contador + "- " + nombres[i] + " con --> " +  nombres[i+1]);
            contador++;
        }


    }
}
