import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ouiNon = 'O';
        char profil = 1;
        char modif = 2;
        char ecrire = 3;
        char afficher = 4;
        char ami = 5;
        char nomAmi = 6;






        while (ouiNon == 'O') {

            System.out.println("Créer un profil");
            System.out.println("Veuillez saisir un nom :");
            String nom = sc.nextLine();
            System.out.println("Veuillez saisir un prenom :");
            String prenom = sc.nextLine();
            System.out.println("Veuillez saisir votre age :");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Vous avez saisi : Votre nom : " + nom + "| Votre prenom : " + prenom + "| Votre age :  " + age);

            System.out.println("Afficher votre profil (1)?");
            System.out.println("Modifier vos infos personnelles (2)? ");
            System.out.println("Ecrire un message ? (3)");
            System.out.println("Afficher un message ? (4)");
            System.out.println("Ajouter un ami ? (5)");
            System.out.println("Voulez-vous afficher le nom d’un ami (6)?");
            System.out.println("Voulez vous créer un autre profil? (O/N)?)");

            ouiNon = sc.nextLine().charAt(0);















        }
    }
}
