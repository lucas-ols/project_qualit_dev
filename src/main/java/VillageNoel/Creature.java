package main.java.VillageNoel;

public class Creature extends Personnage{
	
	public Creature(String nom ,Sexe sexe ,int age ,int magie_noel,Batiment lieu_initial) {
		super(nom, sexe, age, magie_noel, lieu_initial);
        
	}

	@Override
	public boolean estHumanoide() {
		return false;
	}

	@Override
	protected String getSon() {
		return "HAhaaaaAH";
	}
}
