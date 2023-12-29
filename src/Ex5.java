
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie de l'heure
        System.out.println("Entrez l'heure (format 24h) : ");
        int heure = scanner.nextInt();

        // Saisie de la langue (f pour français, a pour anglais)
        System.out.println("Choisissez la langue (f pour français, a pour anglais) : ");
        char langue = scanner.next().charAt(0);

        // Affichage du message en fonction de l'heure et de la langue
        if (langue == 'f' || langue == 'F') {
            if (heure >= 0 && heure <= 18) {
                System.out.println("Bonjour");
            } else if (heure > 18 && heure <= 22) {
                System.out.println("Bonsoir");
            } else {
                System.out.println("Bonne nuit");
            }
        } else if (langue == 'a' || langue == 'A') {
            if (heure >= 0 && heure <= 18) {
                System.out.println("Good Morning");
            } else if (heure > 18 && heure <= 22) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }
        } else {
            System.out.println("Langue non prise en charge. Choisissez 'f' pour français ou 'a' pour anglais.");
        }

        scanner.close();
    }
}

