package VillageNoel;

public class Humanoide extends Personnage{
	
	private static Boolean humanoide = true;
	
	public Humanoide(String nom ,String sexe ,int age ,int magie_noel,Batiment lieu_initial) {
		super(nom, sexe, age, magie_noel, lieu_initial,humanoide);
	}

}
