package projetJava;

import java.util.ArrayList;


class Utilisateur {
    String nom;
    int numeroIdentification;
    ArrayList<Livre> livresEmpruntes;

    public Utilisateur(String nom, int numeroIdentification) {
        this.nom = nom;
        this.numeroIdentification = numeroIdentification;
        this.livresEmpruntes = new ArrayList<>();
    }
    // Getters and setters
    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public int getnumeroIdentification() {
        return numeroIdentification;
    }

    public void setnumeroIdentification(int numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
    }

    public void emprunterLivre(Livre livre) {
        livresEmpruntes.add(livre);
    }

    public void retournerLivre(Livre livre) {
        livresEmpruntes.remove(livre);
    }

    public void afficherLivresEmpruntes() {
        for (Livre livre : livresEmpruntes) {
            System.out.println(livre);
        }
    }
}
