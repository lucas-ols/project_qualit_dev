package VillageNoel;

public class Confiseries extends Batiment{

	public Confiseries(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return true;
		
	}

}
