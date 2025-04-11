import java.util.ArrayList;
import java.util.Scanner;

public class Pharmacie {
    private ArrayList<Medicament> stock = new ArrayList<>();

    public void ajouterMedicament(Medicament medicament) {
        stock.add(medicament);
    }

    public void afficherStock() {
        System.out.println("\n--- Stock actuel ---");
        for (int i = 0; i < stock.size(); i++) {
            Medicament m = stock.get(i);
            System.out.println(i + ". " + m.getNom() + " | Quantité: " + m.getQuantite() + " | Ordonnance: " + m.isAvecOrdonnance());
        }
    }

    public void supprimerMedicament(Scanner scanner) {
        afficherStock();
        System.out.print("Entrez l'index du médicament à supprimer: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < stock.size()) {
            Medicament m = stock.remove(index);
            System.out.println("Médicament supprimé: " + m.getNom());
        } else {
            System.out.println("Index invalide.");
        }
    }

    public void gestionStock(Scanner scanner) {
        boolean retour = false;
        while (!retour) {
            System.out.println("\n--- Gestion du stock ---");
            System.out.println("1. Afficher le stock");
            System.out.println("2. Ajouter un médicament");
            System.out.println("3. Supprimer un médicament");
            System.out.println("4. Retour");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consomme le retour à la ligne

            switch (choix) {
                case 1:
                    afficherStock();
                    break;
                case 2:
                    System.out.print("Nom du médicament: ");
                    String nom = scanner.nextLine();
                    System.out.print("Quantité: ");
                    int quantite = scanner.nextInt();
                    System.out.print("Nécessite une ordonnance (true/false): ");
                    boolean ordonnance = scanner.nextBoolean();
                    ajouterMedicament(new Medicament(nom, quantite, ordonnance));
                    break;
                case 3:
                    supprimerMedicament(scanner);
                    break;
                case 4:
                    retour = true;
                    break;
                default:
                    System.out.println("Option invalide.");
            }
        }
    }

    public void traiterAchats(Scanner scanner) {
        // Placeholder: implémentation à compléter selon besoins
        System.out.println("Traitement des achats non encore implémenté.");
    }
}
