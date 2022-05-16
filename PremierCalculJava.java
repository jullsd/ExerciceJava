package MONPREMIERCODEQUIMARCHE;

public class PremierCalculJava
{
    public static void main(String[] args) {

        byte nombre1 = 2;
        int nombre5 = 3;
        float resultat;


        // byte + byte = int
        // Long+int=Long
        //float décimal
        // Attention si texte avant chiffre bien mettre () calcul
        //++Nombre permet derajouter 1 à la valeur du nombre

        //possible de transgresser la régle de cette maniére / byte resultat = (byte) (nombre1 + nombre2); si programme demande une petite capacité pour cette action.

        resultat = ++nombre1 + nombre5;

        System.out.println("nombre 1 + nombre2 = " +(nombre1+ nombre5));

        System.out.println(+nombre1+ "+"+nombre5+"="+resultat);

        resultat = nombre1 - nombre5;

        System.out.println(+nombre1+ "-"+nombre5+"="+resultat);

        resultat = nombre1 * nombre5;

        System.out.println(+nombre1+ "*"+nombre5+"="+resultat);

        resultat = nombre5 / nombre1;

        System.out.println(+nombre5+ "/"+nombre1+"="+resultat);

        resultat = nombre1%nombre5;

        System.out.println(resultat);



    }

}
