package main.java.VillageNoel;

public class Lutins extends Humanoide implements Travailleur,Divertir {

	public Lutins(String nom, Sexe sexe, int age, int magie_noel,Batiment lieu_initial) {
		super(nom, sexe, age, magie_noel, lieu_initial);
	}

	@Override
	public void divertir() {
		
	}

	@Override
	public void travailler() {
		
	}

	@Override
	protected String getSon() {
		return "HIHIHIHI";
	}

}
