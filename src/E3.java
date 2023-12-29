import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier nombre entier (a) : ");
        int a = scanner.nextInt();
        System.out.println("Entrez le deuxième nombre entier (b) : ");
        int b = scanner.nextInt();
        System.out.println("Choisissez une option :");
        System.out.println("1. Vérifier si la somme a + b est paire.");
        System.out.println("2. Vérifier si le produit ab est pair.");
        System.out.println("3. Connaître le signe de la somme a + b.");
        System.out.println("4. Connaître le signe du produit ab.");
        int choix = scanner.nextInt();
        switch (choix) {
            case 1:
                verifierSommePaire(a, b);
                break;
            case 2:
                verifierProduitPaire(a, b);
                break;
            case 3:
                connaitreSigneSomme(a, b);
                break;
            case 4:
                connaitreSigneProduit(a, b);
                break;
            default:
                System.out.println("Choix non valide. Veuillez entrer un nombre entre 1 et 4.");
        }

        scanner.close();
    }
    private static void verifierSommePaire(int a, int b) {
        int somme = a + b;
        if (somme % 2 == 0) {
            System.out.println("La somme a + b est paire.");
        } else {
            System.out.println("La somme a + b n'est pas paire.");
        }
    }

    // Fonction pour vérifier si le produit ab est pair
    private static void verifierProduitPaire(int a, int b) {
        int produit = a * b;
        if (produit % 2 == 0) {
            System.out.println("Le produit ab est pair.");
        } else {
            System.out.println("Le produit ab n'est pas pair.");
        }
    }
    private static void connaitreSigneSomme(int a, int b) {
        int somme = a + b;
        if (somme > 0) {
            System.out.println("La somme a + b est positive.");
        } else if (somme < 0) {
            System.out.println("La somme a + b est négative.");
        } else {
            System.out.println("La somme a + b est égale à zéro.");
        }
    }
    private static void connaitreSigneProduit(int a, int b) {
        int produit = a * b;
        if (produit > 0) {
            System.out.println("Le produit ab est positif.");
        } else if (produit < 0) {
            System.out.println("Le produit ab est négatif.");
        } else {
            System.out.println("Le produit ab est égal à zéro.");
        }
    }
}

