package VillageNoel;

public class Chalet extends Batiment{
	public Chalet(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}
	@Override
	public boolean accepte(Personnage p) {
		return true;
	}
}
