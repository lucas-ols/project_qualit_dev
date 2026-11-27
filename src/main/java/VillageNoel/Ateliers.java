package main.java.VillageNoel;

public class Ateliers extends Batiment{
	
	public Ateliers(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}
	@Override
	public boolean accepte(Personnage p) {
		return true;
	}
}
