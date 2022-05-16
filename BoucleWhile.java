package MONPREMIERCODEQUIMARCHE;

public class BoucleWhile {

    public static void main(String[] args) {


        int x = 0;

        while (x < 15) {

            ///x++ incrématation augmente la valeur de 1 à chaque fois.
            System.out.println(x++);

        }


        ///Formulation do et while.
        do {
            System.out.print(x++);
        } while (x < 100);



    }
}



