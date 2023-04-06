package fr.banque.marie;

public class Main {
    public static void main(String[] args) {
Compte marie = new Compte(1542, 15420.90);
        Compte cam = new Compte(1545, 1500);

        marie.virer(50,cam);
        marie.afficherSolde();
        cam.afficherSolde();
    }
}