package MONPREMIERCODEQUIMARCHE;

import java.util.Scanner;

public class ConditionIfDansJava {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        String nom = "Julien";
        String nom2 = clavier.nextLine();

        if (nom.equals(nom2)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        int nombre = 8;

        // if = variable de condition.
//// derniere condition si seul ligne en dessous compte sinon mettre acoda
        // condition marche avec > < <= >= !=

        if (nombre == 5) {
            System.out.println("oui le nombre est égal à 5");
            System.out.print("la condition est bien rempli");

        }else if(nombre ==6){
            System.out.println("le nombre est égale à 6");

        }else if(nombre ==7) {
            System.out.println("le nombre est égale à 7");

        }else{
            System.out.println("un autre nombre que 5,6 ou 7");

            // possible de crée 2 condition dans une condition && = il faut que tout les condition soit rempli
            // || = ou
            if(nombre >=5 && nombre <10){
            System.out.println("le nombre est entre 5 et 10"); }

            if(nombre==5 || nombre==10 ) {
                System.out.println("le nombre est entre 5 et 10"); }
            }

//// Resumé == égal / > suppérieur / < inférieur / >= suppérieur  ou égale/ <= inférieur ou égale/ =! n'est pas égale.
        /// && ET OU AND /// || OU OR/
        // C'est les outils dans lesquels avec java nous allons

}

    }
