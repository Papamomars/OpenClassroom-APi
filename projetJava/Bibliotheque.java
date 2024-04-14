package projetJava;


import java.util.ArrayList;
import java.util.HashMap;
class Bibliotheque {
    private ArrayList<Livre> listeLivres;
    private HashMap<Utilisateur, ArrayList<Livre>> empruntsUtilisateurs;

    public Bibliotheque() {
        this.listeLivres = new ArrayList<>();
        this.empruntsUtilisateurs = new HashMap<>();
    }

    public void ajouterLivre(Livre livre) {
        listeLivres.add(livre);
    }

    public void supprimerLivre(Livre livre) {
        listeLivres.remove(livre);
    }

    public Livre rechercherLivreParTitre(String titre) {
        for (Livre livre : listeLivres) {
            if (livre.getTitre().equals(titre)) {
                return livre;
            }
        }
        return null; // Livre non trouvé
    }

    public Livre rechercherLivreParAuteur(String auteur) {
        for (Livre livre : listeLivres) {
            if (livre.getAuteur().equals(auteur)) {
                return livre;
            }
        }
        return null; // Livre non trouvé
    }

    public Livre rechercherLivreParISBN(String ISBN) {
        for (Livre livre : listeLivres) {
            if (livre.getISBN().equals(ISBN)) {
                return livre;
            }
        }
        return null; // Livre non trouvé
    }

    public void enregistrerEmprunt(Utilisateur utilisateur, Livre livre) {
        ArrayList<Livre> livresEmpruntes = empruntsUtilisateurs.getOrDefault(utilisateur, new ArrayList<>());
        livresEmpruntes.add(livre);
        empruntsUtilisateurs.put(utilisateur, livresEmpruntes);
    }

    public void enregistrerRetour(Utilisateur utilisateur, Livre livre) {
        ArrayList<Livre> livresEmpruntes = empruntsUtilisateurs.getOrDefault(utilisateur, new ArrayList<>());
        livresEmpruntes.remove(livre);
        empruntsUtilisateurs.put(utilisateur, livresEmpruntes);
    }

    public boolean verifierEligibilite(Utilisateur utilisateur) {
        // Logique pour vérifier l'éligibilité à emprunter un livre
        return true; // Temporairement toujours vrai
    }

    public void afficherStatistiques() {
        // Logique pour afficher les statistiques de la bibliothèque
    }
}





