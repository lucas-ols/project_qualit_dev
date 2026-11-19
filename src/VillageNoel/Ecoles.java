package VillageNoel;

public class Ecoles extends Batiment{

	public Ecoles(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return null;
		
	}

}
