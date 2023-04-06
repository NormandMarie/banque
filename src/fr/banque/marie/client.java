package fr.banque.marie;
import java.util.Scanner;
public class client {
    private String nom;
    private Compte[] comptes = new Compte[100];
    int nbComptes;

    public client(String nomClient) {
        this.nom = nomClient;
        this.ajouterCompte();
    }
    Scanner scanner = new Scanner(System.in);
    public String getNom() {
        return nom;
    }

    public int getNbComptes() {
        return nbComptes;
    }

    protected double getSolde() {
        double sum = 0;
        for (Object compte1 : comptes) {
            if (compte1 instanceof Compte) {
                Compte compte = (Compte) compte1;
                sum += compte.getSolde();

            }
        }
        return sum;
    }


    protected void ajouterCompte() {
        comptes[nbComptes] = new Compte(0, 0);
        nbComptes += 1;
    }

    public double afficherSolde() {
        double tout = comptes[0].getSolde();
        System.out.println("totale des compte: " + tout);
        return tout;
    }

    void interactionDepot() {
        float montantPlus;
        try {
            System.out.print("De quel montant ? : ");
            montantPlus = scanner.nextInt();
            int choixCompte = 0;
            comptes[choixCompte].depot(montantPlus);
        } catch (Exception e) {
            System.out.println("Erreur de saisi clavier !! ");
        }
    }

}