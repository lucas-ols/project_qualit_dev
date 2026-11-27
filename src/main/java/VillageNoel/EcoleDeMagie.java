package main.java.VillageNoel;

public class EcoleDeMagie extends Batiment{
	
	public EcoleDeMagie(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil, true);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return true;
	}
}
