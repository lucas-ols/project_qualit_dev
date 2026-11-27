package main.java.VillageNoel;

import java.util.ArrayList;
import java.util.List;

public abstract class Batiment implements MagieNoel{
    
    private double superficie;
    private int capacite_accueil;
    private String degre_proprete;
    private Boolean interieur;
    private List<Personnage> personnages_presents;

    public Batiment(double superficie, int capacite_accueil, Boolean interieur) {
        this.superficie = superficie;
        this.capacite_accueil = capacite_accueil;
        this.degre_proprete = "bon";
        this.interieur = interieur;
        this.personnages_presents = new ArrayList<>();
    }

    public double getSuperficie(){
        return this.superficie;
    }

    public int getCapaciteAccueil(){
        return this.capacite_accueil;
    }

    public String getDegreProprete(){
        return this.degre_proprete;
    }

    public Boolean getInterieur(){
        return this.interieur;
    }

    public List<Personnage> getPersonnagesPresents(){
        return this.personnages_presents;
    }
    
    @Override
	public int getTotalMagieNoel() {
    	int somme = 0;
    	for (Personnage p : personnages_presents) {
            somme += p.getMagieNoel();
        }
    	return somme;
	}
    
    public void afficherInfos() {
        System.out.println("=== INFORMATIONS DU BÂTIMENT ===");
        System.out.println("- Superficie : " + this.getSuperficie() + " m²");
        System.out.println("- Capacité d'accueil : " + this.getCapaciteAccueil() + " personnes");
        System.out.println("- Degré de propreté : " + this.getDegreProprete());
        System.out.println("- A l'interieur: " + this.getInterieur());
        System.out.println("- Nombre de personnages présents : " + this.getPersonnagesPresents().size());
        
        System.out.println("- Personnages à l'intérieur :");
        if (this.personnages_presents.isEmpty()) {
            System.out.println("  (Le bâtiment est actuellement vide)");
        } else {
            for (Personnage p : this.personnages_presents) {
                System.out.println("  * " + p.getNom() + " (Sexe: " + p.getSexe() +"Âge: " + p.getAge() + ", Magie de Noël: " + p.getMagieNoel() + ")");
            }
        }
        System.out.println("================================");
    }

    public abstract Boolean accepter(Personnage p);
    
    public boolean peutAccueillir(Personnage p) {
        if (personnages_presents.size() >= capacite_accueil) {
            System.out.println("Échec : Le bâtiment est complet !");
            return false;
        }else {
        	return accepter(p);
        }
    }

    public void ajouterPersonnage(Personnage p) {
        if (peutAccueillir(p)) {
        	personnages_presents.add(p);
            System.out.println(p.getNom() + " est entré dans le bâtiment.");
        }
    }

    
    public void retirerPersonnage(Personnage p) {
    	personnages_presents.remove(p);
    }
    
    public void entretien() {
    	if(this.degre_proprete == "mauvais" && this.personnages_presents.isEmpty() ) {
    		this.degre_proprete = "bon";
    		System.out.println("le batiment a ete entretenu");
    	}
    }
}