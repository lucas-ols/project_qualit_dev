package VillageNoel;

public class Humanoide extends Personnage{
	
	public Humanoide(String nom ,Sexe sexe ,int age ,int magie_noel, Batiment lieu_initial) {
		super(nom, sexe, age, magie_noel, lieu_initial);
	}

	@Override
	public boolean estHumanoide() {
		return true;
	}

	@Override
	protected String getSon() {
		throw new UnsupportedOperationException("Le personnage ne possède pas de méthode : 'getSon'");
	}
}
