package MONPREMIERCODEQUIMARCHE;

import java.util.Scanner;

public class ExercicePRemiercalcul {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("nombre1 = ");

        int nombre1 = clavier.nextInt();

        System.out.print("nombre2 = ");

        int nombre2 = clavier.nextInt();

        int resultat = nombre1+nombre2;

        System.out.println(nombre1+ "+" +nombre2+ "=" +resultat);

    int resultat1 =   nombre1-nombre2;

        System.out.println(nombre1+ "-" +nombre2+ "=" +resultat1);

        float resultat2 = nombre1 / nombre2;

        System.out.println(nombre1+ "/" +nombre2+ "=" +resultat2);

        int resultat3 = nombre1 * nombre2;

        System.out.println(nombre1+ "*" +nombre2+ "=" +resultat3);

        int resultat4 = nombre1%nombre2;

                System.out.println("le reste du nombre 2 ="+resultat4);


    }

}
