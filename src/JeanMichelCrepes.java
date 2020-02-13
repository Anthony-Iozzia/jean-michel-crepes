/**
 * Author : Anthony Iozzia
 * Date : 2019-10-10
 */

import java.util.Scanner;

public class JeanMichelCrepes {

    // Entree clavier
    private static Scanner keyb = new Scanner(System.in);

    /* Ingredients pour 1 crepe (constantes) */
    // Oeufs
    private final static double OEUFS = 4.0 / 12.0;
    // Lait en L
    private final static double LAIT = 0.5 / 12.0;
    // Farine en kg
    private final static double FARINE = 0.25 / 12.0;
    // Sel, rhum, fleur d'oranger, sucre vanille, huile
    private final static double AUTRES = 1.0 / 12.0;

    /**
     * Methode principale : elle demande le nombre de crepes a l'utilisateur et
     * elle calcule les quantites d'ingredients. Elle recommence tant que
     * l'utilisateur n'entre pas un nombre negatif.
     */
    public static void main(String[] args) {
        System.out.println("----- JEAN MICHEL CREPES -----");
        System.out.println("Entrez le nombre de crepes souhaitees ou un nombre negatif pour arreter le programme.");

        int entree = 0;

        while (entree >= 0) {
            System.out.println();
            System.out.print("> ");
            entree = keyb.nextInt();

            if(entree >= 0) {
                if(entree == 0) {
                    System.out.println("Attention : il est fort probable que vous n'ayiez rien a manger a l'issue de la preparation.");
                } else if(entree == 42) {
                    System.out.println(";)");
                } else if(entree == 69 || entree == 420) {
                    System.out.println("Nice");
                }
                
                displayIngredients(entree);
                System.out.println("____________________________________________________________");
            }
        }

        System.out.println();
        System.out.println("Fin du programme.");
    }

    /**
     * Affiche les ingredients et leur quantite, en fonction du nombre de crepes
     * 
     * @param nbCrepes nombre de crepes que l'utilisateur souhaite
     */
    private static void displayIngredients(int nbCrepes) {

        // Calcul du nombre d'oeufs necessaires. Le nombre sera arrondi plus
        // tard a l'entier le plus proche
        double oeufs = OEUFS * nbCrepes;

        // Calcul du lait (arrondi a 3 chiffres apres la virgule)
        double lait = Math.round(LAIT * nbCrepes * 1000.0) / 1000.0;

        // Calcul de la farine (arrondi a 3 chiffres apres la virgule)
        double farine = Math.round(FARINE * nbCrepes * 1000.0) / 1000.0;

        // Calcul des autres ingredients
        double autres = AUTRES * nbCrepes;

        if (oeufs < 1.0 && oeufs != 0) {
            oeufs = 1.0;
        } else {
            oeufs = Math.round(oeufs);
        }

        if (autres < 1.0 && autres != 0) {
            autres = 1.0;
        } else {
            autres = Math.round(autres);
        }

        System.out.print("Pour " + nbCrepes + " crepe");
        if (nbCrepes > 1) {
            System.out.print("s");
        }
        System.out.println(", il vous faut :");

        // Affichage des oeufs
        System.out.print("- " + (int) oeufs + " oeuf");
        if (oeufs > 1.0) {
            System.out.print("s");
        }
        System.out.println();

        // Affichage du lait
        System.out.print("- ");
        if (lait >= 1.0) {
            System.out.print(lait + " L");
        } else {
            lait *= 1000.0;
            System.out.print((int) lait + " ml");
        }
        System.out.println(" de lait");

        // Affichage de la farine
        System.out.print("- ");
        if (farine >= 1.0) {
            System.out.print(farine + " kg");
        } else {
            farine *= 1000.0;
            System.out.print((int) farine + " g");
        }
        System.out.println(" de farine");

        // Affichage des pincees de sel
        System.out.print("- " + (int) autres + " pincee");
        if (autres > 1.0) {
            System.out.print("s");
        }
        System.out.println(" de sel");

        // Affichage du rhum
        System.out.print("- " + (int) autres + " cuilleree");
        if (autres > 1.0) {
            System.out.print("s");
        }
        System.out.println(" a soupe de rhum ou d'eau de fleur d'oranger");

        // Affichage du sucre vanille
        System.out.print("- " + (int) autres + " sachet");
        if (autres > 1.0) {
            System.out.print("s");
        }
        System.out.println(" de sucre vanille");

        // Affichage de l'huile
        System.out.print("- " + (int) autres + " cuilleree");
        if (autres > 1.0) {
            System.out.print("s");
        }
        System.out.println(" d'huile");
    }
}
