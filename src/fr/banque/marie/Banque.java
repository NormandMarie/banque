package fr.banque.marie;

public class Banque {
    private String nom;
    client[] clients = new client[100];
    private int nbClients;

    public Banque(String nom) {
        this.nom = nom;
        this.clients = new client[100];
        this.nbClients = 0;
    }

    public void listerClients() {
        System.out.println("Liste des clients de la banque " + this.nom + ":");
        for (int i = 0; i < nbClients; i++) {
            client client = this.clients[i];
            if (client != null) {
                System.out.println((i+1) + ")" + client.getNom());
            }
        }
    }
    public void ajouterClient(String nomClient) {
        client newClient = new client(nomClient);
        newClient.ajouterCompte();
        this.clients[this.nbClients] = newClient;
        this.nbClients++;

    }
    public client getClient(String nom) {
        for (client client : clients) {
            if (client.getNom().equals(nom)) {
                return client;
            }
        }
        return null;
    }
    public double bilanClient(String nom) {
        double sum = 0;
        for (int i = 0; i < this.nbClients; i++) {
            if (this.clients[i].getNom().equals(nom)) {
                sum = this.clients[i].afficherSolde();
            } else {
                System.out.println(nom + " ce client est introuvable");
            }
        }
        return sum;
    }
    public void afficherBilan() {
        double totale =0;
        System.out.println("Bilan de la banque " + this.nom);
        for (int i = 0; i < this.nbClients; i++) {
            System.out.println("Client " + this.clients[i].getNom());
            this.clients[i].afficherSolde();

        }
    }
}
