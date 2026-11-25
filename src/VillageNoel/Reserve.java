package VillageNoel;

public class Reserve extends Batiment{
	private static final int capacite_accueil = 0;
	public Reserve(double superficie) {
		super(superficie, capacite_accueil);
	}
	@Override
	public boolean accepte(Personnage p) {
		return false;
	}
}
