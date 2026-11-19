package VillageNoel;

public class Boutiques extends Batiment{

	public Boutiques(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return null;
		
	}

}
