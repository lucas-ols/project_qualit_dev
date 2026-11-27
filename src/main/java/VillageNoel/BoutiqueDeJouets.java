package main.java.VillageNoel;

public class BoutiqueDeJouets extends Batiment{
	public BoutiqueDeJouets(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil, true);
	}
	@Override
	public Boolean accepter(Personnage p) {
		if (p.estHumanoide()) {
			return true;
		}
		return false;
	}
}
