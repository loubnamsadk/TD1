import java.util.Scanner;

public class EX16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les éléments du tableau initial  : ");
        String[] tableau = scanner.nextLine().split(" ");
        System.out.println("Tableau initial :");
        afficherTableau(tableau);
        deplacerElements(tableau);
        System.out.println("Tableau modifié :");
        afficherTableau(tableau);
        scanner.close();
    }
    private static void deplacerElements(String[] tableau) {
        if (tableau.length > 1) {
            String premierElement = tableau[0];

            for (int i = 1; i < tableau.length; i++) {
                tableau[i - 1] = tableau[i];
            }

            tableau[tableau.length - 1] = premierElement;
        }
    }

    private static void afficherTableau(String[] tableau) {
        for (String element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
