package main.java.VillageNoel;

public class BureauxDePoste extends Batiment{
	public BureauxDePoste(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}
	@Override
	public Boolean accepter(Personnage p) {
		return true;
	}
}
