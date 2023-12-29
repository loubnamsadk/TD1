import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre d'étudiants : ");
        int n = scanner.nextInt();

        double[] moyennes = new double[n];

        // Saisie des moyennes des étudiants
        for (int i = 0; i < n; i++) {
            System.out.println("Entrez la moyenne de l'étudiant " + (i + 1) + " : ");
            moyennes[i] = scanner.nextDouble();
        }

        // Saisie du seuil
        System.out.println("Entrez le seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        // Comptage du nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
        int nombreEtudiantsAuDessusSeuil = compterEtudiantsAuDessusSeuil(moyennes, seuil);


        System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil est : " + nombreEtudiantsAuDessusSeuil);

        scanner.close();
    }

    private static int compterEtudiantsAuDessusSeuil(double[] moyennes, double seuil) {
        int compte = 0;
        for (double moyenne : moyennes) {
            if (moyenne >= seuil) {
                compte++;
            }
        }
        return compte;
    }
}
