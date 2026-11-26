package main.java.VillageNoel;

public class Enclos extends Batiment{
	public Enclos(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}
	@Override
	public boolean accepte(Personnage p) {
		return true;
	}
}
