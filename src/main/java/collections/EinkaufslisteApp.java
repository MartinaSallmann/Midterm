package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class EinkaufslisteApp {
    public static void main(String[] args) {
        ArrayList<Einkauf> einkaufsliste = new ArrayList<>();
        einkaufsliste.add(new Einkauf("Milch",1.50));
        einkaufsliste.add(new Einkauf("Butter",0.90));
        einkaufsliste.add(new Einkauf("Joghurt",1.20));

        System.out.println("Summe Einkaufsliste ist: " + sum(einkaufsliste) );

        HashSet<Einkauf> unique = unique(einkaufsliste);
        System.out.println("unique = " + unique);
        System.out.println("Summe HashSet ist: " + sum(unique));



    }

    public static double sum(ArrayList<Einkauf> einkaufsliste) {
        double sum = 0;

        for (Einkauf einkauf : einkaufsliste) {
            sum += einkauf.getPreis();
        }
        return sum;
    }

    public static HashSet<Einkauf> unique(ArrayList<Einkauf> einkaufsliste) {
        HashSet<Einkauf> set = new HashSet<>();

        set.addAll(einkaufsliste);
        return set;
    }

    public static double sum(HashSet < Einkauf > set) {

        double sum = 0;

        for (Einkauf einkauf : set) {
            sum += einkauf.getPreis();
        }
        return sum;


    }
}
