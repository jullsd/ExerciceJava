package MONPREMIERCODEQUIMARCHE;


import java.util.Scanner;

public class ExerciceSwitch {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);


        System.out.print("nombre 1 = ");
        int nombre1 = clavier.nextInt();


        System.out.print("nombre 2 = ");
        int nombre2 = clavier.nextInt();


        System.out.println("Que voulez vous faire avec " + nombre1 + " et " + nombre2 + "");

        System.out.println(" ");
        System.out.println("--------------------");
        System.out.println("1 pour +");
        System.out.println("2 pour -");
        System.out.println("3 pour *");
        System.out.println("4 pour /");

        System.out.print("faites votre choix = ");


        int choix = clavier.nextInt();

        int resultat1 = nombre1 + nombre2;
        int resultat2 = nombre1 - nombre2;
        int resultat3 = nombre1 * nombre2;
        if (nombre2!=0) {
            int resultat4 = nombre1 / nombre2;



        switch (choix) {

            case 1:
                System.out.println(resultat1);
                break;
            case 2:
                System.out.println(resultat2);
                break;
            case 3:
                System.out.println(resultat3);
                break;


            case 4:
                    System.out.print(resultat4);


                }
        } else{



            switch (choix) {

                case 1:
                    System.out.println(resultat1);
                case 2:
                    System.out.println(resultat2);
                case 3 :
                    System.out.println(resultat3);

                case 4 :
                System.out.println("Il est impossible de diviser par 0");

            }
        }

        }

    }
