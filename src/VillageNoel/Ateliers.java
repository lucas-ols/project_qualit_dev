package VillageNoel;

public class Ateliers extends Batiment{

	public Ateliers(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return null;
		
	}

}
