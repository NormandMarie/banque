package fr.banque.marie;

import java.util.Scanner;

public class BanqueInteractive {
    Scanner scanner = new Scanner(System.in);
    Banque creditMutuel = new Banque("credit mutuel");
    client  camille = new client("camille");

    public void interaction() {
        while (true) {
            System.out.println("Quelle opération voulez-vous effectuer ?\n" +
                    "1) Ajouter un client\n" +
                    "2) Effectuer une opération sur un client\n" +
                    "3) Afficher un bilan général\n" +
                    "4) Sortir du programme");
            System.out.print("- ");
            String saisie = scanner.nextLine();
            if (saisie.equals("1")) {
                interactionAjoutClient();
            } else if (saisie.equals("2")) {
                interactionOperationClient();
            } else if (saisie.equals("3")) {

            }else if (saisie.equals("4")){
                break;
            }
        }
    }
    public void interactionOperationClient() {
        System.out.println("Quel client ? merci de rentré le nom\n");
        creditMutuel.listerClients();
        int choixClient = scanner.nextInt();
        choixClient -= 1;
        client client = creditMutuel.clients[choixClient];
        System.out.println("la somme sur ces compte son de : " + creditMutuel.bilanClient(client.getNom()));

        while (true) {
            System.out.println("Quelle opération voulez-vous effectuer sur le client " + client.getNom() + " ?\n" +
                    " 1) Afficher un bilan \n" +
                    "2) Faire un retrait \n" +
                    "3) Faire un dépôt \n" +
                    "4) Faire un virement \n" +
                        "5) quitter");
            System.out.print("- ");
            String choixOpé = scanner.nextLine();

            if (choixOpé.equals("1")) {
                creditMutuel.bilanClient(client.getNom());
            } else if (choixOpé.equals("2")) {
                client.interactionDepot();
            } else if (choixOpé.equals("3")) {
                client.interactionDepot();
            }else if (choixOpé.equals("4")){
                System.out.println("le 4");
            }else if (choixOpé.equals("5")){
            break;
        }
        }
    }

    private void interactionAjoutClient() {
        System.out.println("Entrez le nom du client : ");
        System.out.print("- ");
        String nom = scanner.nextLine();
        System.out.println(nom + " a été crée");
        creditMutuel.ajouterClient(nom);
    }
}
