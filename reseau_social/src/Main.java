import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String recup = "";
        String ami = "";
        String tableauMessage[] = new String[100];
        String tableauAmi[] = new String[100];
        char ouiNon = 'O';
        int choix = 0;
        System.out.println("Créer un profil");
        System.out.println("Veuillez saisir un nom :");
        String nom = sc.nextLine();
        System.out.println("Veuillez saisir un prenom :");
        String prenom = sc.nextLine();
        System.out.println("Veuillez saisir votre age :");
        int age = sc.nextInt();
        sc.nextLine();


        while (ouiNon == 'O') {

            System.out.println("Vous avez saisi : Votre nom : " + nom + "| Votre prenom : " + prenom + "| Votre age : " + age );

            System.out.println("1 : Afficher votre profil?");
            System.out.println("2 : Modifier vos infos personnelle? ");
            System.out.println("3 : Ecrire un message?");
            System.out.println("4 : Afficher un message?");
            System.out.println("5 : Ajouter un ami?");
            System.out.println("6 : Voulez-vous afficher le nom d’un ami?\r\n");
            choix = sc.nextInt();
            sc.nextLine();

            if(choix == 1){

                System.out.println("Vous avez saisi : Votre nom : " + nom + "| Votre prenom : " + prenom + "| Votre age : " + age );


            }
            else if(choix == 2){

                System.out.println("Saisissez vos nouvelles informations :");
                System.out.println("Veuillez saisir un nom :");
                nom = sc.nextLine();
                System.out.println("Veuillez saisir un prenom :");
                prenom = sc.nextLine();
                System.out.println("Veuillez saisir votre age :");
                age = sc.nextInt();
                sc.nextLine();

            }
            else if(choix == 3){


                System.out.println("Veuillez saisir un message :");
                recup = sc.nextLine();

                for(int i = 0; i < tableauMessage.length; i++){



                    if(tableauMessage[i] == null){

                        tableauMessage[i] = recup;
                        break;

                    }
                }
            }
            else if(choix == 4) {

                for (int i = 0; i < tableauMessage.length; i++) {

                    if(tableauMessage[i] != null ){

                        System.out.println(tableauMessage[i]);

                    }
                }
            }
            else if(choix == 5){

                System.out.println("Veuillez saisir le nom d'un Ami :");
                recup = sc.nextLine();

                for(int i = 0; i < tableauAmi.length; i++){



                    if(tableauAmi[i] == null){

                        tableauAmi[i] = recup;
                        break;

                    }
                }
            }
            else if(choix == 6) {

                for (int i = 0; i < tableauAmi.length; i++) {

                    if(tableauAmi[i] != null ){

                        System.out.println(tableauAmi[i]);

                    }
                }
            }

            System.out.println("Voulez vous effectuer d'autres opérations? (O/N)?)");



            ouiNon = sc.nextLine().charAt(0);



        }
    }
}
