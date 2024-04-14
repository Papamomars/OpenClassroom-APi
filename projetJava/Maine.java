package projetJava;
public class Maine {
    public static void main(String[] args) {
        // Code pour démarrer l'application et interagir avec le système de gestion de bibliothèque
        // Création d'une bibliothèque
        Bibliotheque bibliotheque = new Bibliotheque();

        // Ajout de quelques livres
        bibliotheque.ajouterLivre(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943, "978-2070612758"));
        bibliotheque.ajouterLivre(new Livre("Harry Potter à l'école des sorciers", "J.K. Rowling", 1997, "978-2070612369"));

        // Création d'un utilisateur
        Utilisateur utilisateur2 = new Utilisateur("Bob", 1002);

        // Emprunt d'un livre par l'utilisateur
        Livre livreEmprunte = bibliotheque.rechercherLivreParTitre("Le Petit Prince");
        if (livreEmprunte != null) {
            if (bibliotheque.verifierEligibilite(utilisateur2)) {
                bibliotheque.enregistrerEmprunt(utilisateur2, livreEmprunte);
                utilisateur2.emprunterLivre(livreEmprunte);
                System.out.println("L'utilisateur " + utilisateur2.getnom() + " a emprunté le livre : " + livreEmprunte.getTitre());
            } else {
                System.out.println("L'utilisateur n'est pas éligible à emprunter ce livre.");
            }
        } else {
            System.out.println("Livre non trouvé dans la bibliothèque.");
        }

        // Affichage des livres empruntés par l'utilisateur
        System.out.println("Livres empruntés par " + utilisateur2.getnom() + " :");
        utilisateur2.afficherLivresEmpruntes();
    }
}

 
