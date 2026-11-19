package VillageNoel;

import java.util.ArrayList;
import java.util.List;

public abstract class Batiment implements MagieNoel{
    protected double superficie;
    protected int capacite_accueil;
    protected String degre_proprete;
    protected List<Personnage> personnages_presents;

    public Batiment(double superficie, int capacite_accueil) {
        this.superficie = superficie;
        this.capacite_accueil = capacite_accueil;
        this.degre_proprete = "bon";
        this.personnages_presents = new ArrayList<>();
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
        System.out.println("- Superficie : " + this.superficie + " m²");
        System.out.println("- Capacité d'accueil : " + this.capacite_accueil + " personnes");
        System.out.println("- Degré de propreté : " + this.degre_proprete);
        System.out.println("- Nombre de personnages présents : " + this.personnages_presents.size());
        
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