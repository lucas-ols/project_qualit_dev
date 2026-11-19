package VillageNoel;

public class creature extends Personnage{
	
	private static Boolean humanoide = false;
	
	public creature(String nom ,String sexe ,int age ,int magieNoel,Batiment lieuInitial) {
		super(nom, sexe, age, magieNoel, lieuInitial, humanoide);
        
	}
}
