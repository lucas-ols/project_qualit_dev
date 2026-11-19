package VillageNoel;

public class MaisonPereNoel extends Batiment{

	public MaisonPereNoel(double superficie) {
		super(superficie, 0);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return false;
		
	}

}
