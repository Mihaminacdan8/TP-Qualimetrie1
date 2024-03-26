/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.qualimétrie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Inclusiv-PC07
 */
public class TriCroissantEntiers2 {
   
    /**
     * Tri à partir d'une liste d'entiers dans l'ordre croissant.
     *@param liste d'entiers à trier.
     * @return Une nouvelle liste contenant les entiers triés dans l'ordre croissant.
     * @throws Gestion d'erreur : IllegalArgumentException a)  si la liste est vide, ou b) si la liste contient des éléments autres que des entiers.
     */
    public static List<Integer> triCroissant(List<Integer> liste) {
        // Gestion des erreurs : Vérification si la liste est vide ou null
        if (liste == null || liste.isEmpty()) {
            throw new IllegalArgumentException("La liste est vide ou null.");
        }

        // Gestion des erreurs : Vérification si la liste contient uniquement des entiers
        for (Integer element : liste) {
            if (!(element instanceof Integer)) {
                throw new IllegalArgumentException("La liste contient des éléments qui ne sont pas des entiers.");
            }
        }

        // Conservation en copiant, pour éviter de modifier l'original
        List<Integer> listeTriee = new ArrayList<>(liste);

        // Tri de la liste
        Collections.sort(listeTriee);

        return listeTriee;
    }

    public static void main(String[] args) {
        // Test de la fonction de tri
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(5);
        liste.add(17);
        liste.add(2);

        System.out.println("Liste non triée : " + liste);
        List<Integer> listeTriee = triCroissant(liste);
        System.out.println("Liste triée : " + listeTriee);
    }
}
    

