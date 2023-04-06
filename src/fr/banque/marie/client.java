package fr.banque.marie;

public class client {
    private String nom;
    private Compte[] comptes = new Compte[100];
    int nbComptes;

    public void Client(String nomDuClient) {
        this.nom = nomDuClient;
    }
    public String getNom(){
        return nom;
    }

    protected double getSolde (){
        double sum =0;
        for (Object compte1: comptes) {
            if (compte1 instanceof Compte){
                Compte compte = (Compte) compte1;
                sum += compte.getSolde();

            }
        }

    }
    protected void ajouterCompte (){
        comptes[nbComptes]= new Compte();
        nbComptes += 1;
    }
    protected void afficherSolde(int index){
        System.out.println(comptes[index].getSolde());
    }
}
