package fr.banque.marie;

public class Compte {

    private int number;
    private double solde;

    public Compte(int number, double solde) {
        this.number = number;
        this.solde = solde;
    }
   public void depot(float valeur){
        solde += valeur;

   }
   public void retrait(float valeur){
        solde -= valeur;
    }

    double getSolde(){
        return solde;
    }

    void afficherSolde(){
        System.out.println(solde);
    }
    void virer(float valeur, Compte destinataire){
        solde -= valeur;
        destinataire.solde += valeur;
    }

}