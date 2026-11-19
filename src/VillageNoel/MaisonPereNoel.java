package VillageNoel;

public class MaisonPereNoel extends Batiment{

	public MaisonPereNoel(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return null;
		
	}

}
