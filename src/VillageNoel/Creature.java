package VillageNoel;

public class Creature extends Personnage{
	
	private static Boolean humanoide = false;
	
	public Creature(String nom ,String sexe ,int age ,int magie_noel,Batiment lieu_initial) {
		super(nom, sexe, age, magie_noel, lieu_initial, humanoide);
        
	}
}
