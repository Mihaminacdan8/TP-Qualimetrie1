/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.qualimétrie1;

/**
 *
 * @author Inclusiv-PC07
 */
public class TriCroissantEntiers1 {
    
     /**
     * Tri d'entiers à partir d'une liste pour créer une autre liste dans l'ordre croissant
     * Utilisation l'algorithme de tri par insertion.
     *@param liste La liste d'entiers à trier.
     * @return Une nouvelle liste contenant les entiers triés dans l'ordre croissant.
     * @throws IllegalArgumentException Si la liste est nulle ou vide.
     */
    public static int[] triCroissant(int[] liste) {
        // Gestion erreur : Vérifier si la liste est nulle ou vide
        if (liste == null || liste.length == 0) {
            throw new IllegalArgumentException("La liste est nulle ou vide.");
        }

        // Créer une copie de la liste pour ne pas modifier l'original
        int[] listeTriee = liste.clone();

        // Appliquer l'algorithme de tri par insertion
        triInsertion(listeTriee);

        return listeTriee;
    }

    /**
     * Tri d'un tableau d'entiers dans l'ordre croissant en utilisant l'algorithme de tri par insertion.
     * @param tableau Le tableau d'entiers à trier.
     */
    private static void triInsertion(int[] tableau) {
        for (int i = 1; i < tableau.length; i++) {
            int valeurCourante = tableau[i];
            int j = i - 1;

            // Déplacer les éléments plus grands que la valeur courante vers la droite
            while (j >= 0 && tableau[j] > valeurCourante) {
                tableau[j + 1] = tableau[j];
                j--;
            }

            // Insérer la valeur courante à sa position correcte
            tableau[j + 1] = valeurCourante;
        }
    }

    public static void main(String[] args) {
        // Exemple
        int[] liste = {9, 1, 8, 3, 5};

        System.out.println("Liste non triée : " + java.util.Arrays.toString(liste));

        try {
            int[] listeTriee = triCroissant(liste);
            System.out.println("Liste triée : " + java.util.Arrays.toString(listeTriee));
        } catch (IllegalArgumentException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
    
}
