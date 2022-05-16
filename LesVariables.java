package MONPREMIERCODEQUIMARCHE;

public class LesVariables {
    public static void main(String[] args) {

        //TutoDeRien Java : Les Variables

        // ATTENTION String est une classe  pour créer variable
        /// Variable toujours ecrire en minuscule/ecrire une fois la même variable/possibilité de mettre _ $/ possibilité nommé plusieur varaible d'un coup
        //Int reserve 32 bits dans la mémoire Verre d'eau vide 32 bits si variables +32bits verres trop rempli ca déborde.

        //ex String
        String nomDeJulien,adresse,ville,pays,tel,email;

        nomDeJulien = "Juju";
        adresse = "9 Rue du Pré";
        ville = "Massy";
        pays = "France";
        email ="julien.sayd@gmail.com";
        tel = "0671098784";

        System.out.println(nomDeJulien);
        //posibilité changé variable nom


            int age = 35;

        System.out.println("mon age est de "+age);




/////8 variables primitives

        ///Variables nombres entiers

        //byte variablebyte = -128 a 127:
        //short variableshort = -32768 a 32767;
        //int varaibleint =  -214748648 a 214783647;
         //long variablelong =12132435466454635424323233L TOUJOURS FINIR PAR 1 L POUR LONG

        byte variablebye = 127;
        short variable = 1239;
        int variableint =313131;
        long variableslong = 929432323234535356L;

        ///Variables nombres décimales

        float exempleFloat = 523.224242F;
        //plus utilisé double
        double exempleDouble = 23242.22424242424D;


        //Variable Char = 1 carractére une lettre 1 chiffre

        char exempleChar ='1';

        //Variable boolean VRAI OU FAUX TRUE OR FALSE

        boolean exemple = false;






    }
}
