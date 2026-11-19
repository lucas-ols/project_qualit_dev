package VillageNoel;

public class Nouriture {

	private String nom;
    private int valeurNutritive;

    public Nouriture(String nom, int valeurNutritive) {
        this.nom = nom;
        this.valeurNutritive = valeurNutritive;
    }

    public String getNom() {
        return nom;
    }

    public int getValeurNutritive() {
        return valeurNutritive;
    }
}
