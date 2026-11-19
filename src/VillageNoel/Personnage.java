package VillageNoel;

public class Personnage {

	private String nom ; 
	private String sexe ; 
	private int age ; 
	private int faim = 0; 
	private Boolean seRepose = false; 
	private int magie_noel;
	private Batiment batiment_actuel;
	private Boolean humanoide;
	
	public Personnage(String nom ,String sexe ,int age ,int magie_noel,Batiment lieu_initial, Boolean humanoide) {
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
		this.magie_noel = magie_noel;
		this.humanoide = humanoide;
		
		this.batiment_actuel = lieu_initial;
        if (lieu_initial != null) {
        	lieu_initial.ajouterPersonnage(this);
        }
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getSexe() {
		return this.sexe;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getMagieNoel() {
		return this.magie_noel;
	}
	
	public void emettreSon() {
		
	}
	
	public void deplacer(Batiment nouveauBatiment) {
        if (this.seRepose) {
            System.out.println(nom + " se repose actuellement et ne peut pas se déplacer.");
            return;
        }

        if (nouveauBatiment.peutAccueillir(this)) {
            
            if (this.batiment_actuel != null) {
                this.batiment_actuel.retirerPersonnage(this);
            }

            this.batiment_actuel = nouveauBatiment;

            nouveauBatiment.ajouterPersonnage(this);

            System.out.println(nom + " s'est déplacé avec succès.");
        } else {
            System.out.println(nom + " s'est vu refuser l'accès au bâtiment.");
        }
    }

	public void etatRepos() {
		
	} 
	
	public void magie() {
		
	} 
	
	public void manger(Nouriture plat) {
        if (this.seRepose) {
            System.out.println(nom + " se repose et ne peut pas manger pour l'instant.");
            return;
        }
        this.faim -= plat.getValeurNutritive();
        if (this.faim < 0) {
            this.faim = 0;
        }

        System.out.println(nom + " a mangé " + plat.getNom() + ". Sa faim est maintenant de " + this.faim);
    }
}
