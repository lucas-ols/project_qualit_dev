package main.java.VillageNoel;

public enum Nourriture {

    BISCUIT("Biscuit", 50),
    CHOCOLATS_CHAUDS("Chocolats chauds", 150),
    GUIMAUVES("Guimauves", 20),
    GRUAU_D_AVOINE("Gruau d'avoine", 35),
    SUCRE_D_ORGE("Sucre d'orge", 25),
    BONBONS("Bonbons", 15);

    private final int valeurNutritive;
    private final String nom;

    Nourriture(String nom, int valeurNutritive) {
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