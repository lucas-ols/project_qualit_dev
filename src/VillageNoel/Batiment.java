package VillageNoel;

import java.util.ArrayList;
import java.util.List;

public abstract class Batiment {
    protected double superficie;
    protected int capaciteAccueil;
    protected String degreProprete;
    protected List<Personnage> personnagesPresents;

    public Batiment(double superficie, int capaciteAccueil) {
        this.superficie = superficie;
        this.capaciteAccueil = capaciteAccueil;
        this.degreProprete = "bon";
        this.personnagesPresents = new ArrayList<>();
    }
    
    public void afficherInfos() {
        System.out.println("=== INFORMATIONS DU BÂTIMENT ===");
        System.out.println("- Superficie : " + this.superficie + " m²");
        System.out.println("- Capacité d'accueil : " + this.capaciteAccueil + " personnes");
        System.out.println("- Degré de propreté : " + this.degreProprete);
        System.out.println("- Nombre de personnages présents : " + this.personnagesPresents.size());
        
        System.out.println("- Personnages à l'intérieur :");
        if (this.personnagesPresents.isEmpty()) {
            System.out.println("  (Le bâtiment est actuellement vide)");
        } else {
            for (Personnage p : this.personnagesPresents) {
                System.out.println("  * " + p.getNom() + " (Sexe: " + p.getSexe() +"Âge: " + p.getAge() + ", Magie de Noël: " + p.getMagieNoel() + ")");
            }
        }
        System.out.println("================================");
    }

    public boolean peutAccueillir(Personnage p) {
        if (personnagesPresents.size() >= capaciteAccueil) {
            System.out.println("Échec : Le bâtiment est complet !");
            return false;
        }else {
        	
        }
        return true;
    }

    public void ajouterPersonnage(Personnage p) {
        if (peutAccueillir(p)) {
            personnagesPresents.add(p);
            System.out.println(p.getNom() + " est entré dans le bâtiment.");
        }
    }

    
    public void retirerPersonnage(Personnage p) {
        personnagesPresents.remove(p);
    }
    
    public void entretien() {
    	if(this.degreProprete == "mauvais" && this.personnagesPresents.isEmpty() ) {
    		this.degreProprete = "bon";
    		System.out.println("le batiment a ete entretenu");
    	}
    }
}