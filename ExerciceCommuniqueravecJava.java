package MONPREMIERCODEQUIMARCHE;

import java.util.Scanner;

public class ExerciceCommuniqueravecJava {

    public static void main (String[] args) {

Scanner clavier = new Scanner(System.in);



System.out.print("Nom:");

        String nom = clavier.next();

        System.out.print("Prénom :");

        String prénom = clavier.next();

            System.out.print("Age:");

            int age = clavier.nextInt();

        System.out.print("Adresse :");

        clavier.nextLine();

        String adresse = clavier.nextLine();



System.out.print("Ville: ");

String ville = clavier.next();

System.out.print("Pays :");

        clavier.nextLine();

String pays = clavier.nextLine();

        System.out.print("mail:");

        String mail = clavier.next();


        System.out.println ("-------------------------");


        System.out.println("Nom :"+nom);
        System.out.println("Prénom :"+prénom);
        System.out.println("AGE :"+age);
        System.out.println("Adresse: "+adresse);
        System.out.println("Ville :"+ville);
        System.out.println("Pays :"+pays);
        System.out.println("mail :"+mail);






    }


}
