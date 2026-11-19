package VillageNoel;

public class humanoide extends Personnage{
	
	private static Boolean humanoide = true;
	
	public humanoide(String nom ,String sexe ,int age ,int magieNoel,Batiment lieuInitial) {
		super(nom, sexe, age, magieNoel, lieuInitial,humanoide);
	}

}
