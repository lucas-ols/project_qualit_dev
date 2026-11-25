package VillageNoel;

public class BoutiqueDeJouets extends Batiment{
	public BoutiqueDeJouets(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}
	@Override
	public boolean accepte(Personnage p) {
		return true;
	}
}
