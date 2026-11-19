package VillageNoel;

public class BureauPoste extends Batiment{

	public BureauPoste(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return null;
		
	}

}
