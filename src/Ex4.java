
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la moyenne de l'étudiant : ");
        double moyenne = scanner.nextDouble();
        // Affichage de la mention correspondante
        if (moyenne >= 16) {
            System.out.println("Très Bien");
        } else if (moyenne >= 14) {
            System.out.println("Bien");
        } else if (moyenne >= 12) {
            System.out.println("Assez Bien");
        } else if (moyenne >= 10) {
            System.out.println("Passable");
        } else {
            System.out.println("Non Admis");
        }

        scanner.close();
    }
}

