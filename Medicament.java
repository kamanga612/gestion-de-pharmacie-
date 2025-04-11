public class Medicament {
    private String nom;
    private int quantite;
    private boolean avecOrdonnance;

    public Medicament(String nom, int quantite, boolean avecOrdonnance) {
        this.nom = nom;
        this.quantite = quantite;
        this.avecOrdonnance = avecOrdonnance;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public boolean isAvecOrdonnance() {
        return avecOrdonnance;
    }
}
