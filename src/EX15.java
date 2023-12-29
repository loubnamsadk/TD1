import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la taille des matrices carrées (un seul nombre) : ");
        int taille = scanner.nextInt();

        System.out.println("Saisie de la première matrice :");
        double[][] matrice1 = saisirMatrice(taille);
        System.out.println("Saisie de la deuxième matrice :");
        double[][] matrice2 = saisirMatrice(taille);
        double[][] sommeMatrices = calculerSommeMatrices(matrice1, matrice2);

        System.out.println("La somme des matrices est :");
        afficherMatrice(sommeMatrices);

        scanner.close();
    }
    private static double[][] saisirMatrice(int taille) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrice = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.println("Entrez l'élément de la matrice à la position [" + i + "][" + j + "] : ");
                matrice[i][j] = scanner.nextDouble();
            }
        }

        return matrice;
    }
    private static double[][] calculerSommeMatrices(double[][] matrice1, double[][] matrice2) {
        int taille = matrice1.length;
        double[][] sommeMatrices = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                sommeMatrices[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return sommeMatrices;
    }

    // Fonction pour afficher une matrice carrée
    private static void afficherMatrice(double[][] matrice) {
        int taille = matrice.length;

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
