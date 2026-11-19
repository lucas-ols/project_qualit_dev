package VillageNoel;

public class AireJeux extends Batiment{

	public AireJeux(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return null;
		
	}

}
