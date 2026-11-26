package main.java.VillageNoel;

public class EcoleDeMagie extends Batiment{
	public EcoleDeMagie(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}
	@Override
	public boolean accepte(Personnage p) {
		return true;
	}
}
