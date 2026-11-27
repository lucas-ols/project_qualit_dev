package main.java.VillageNoel;

public class Confiseries extends Batiment{
	public Confiseries(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil,true);
	}
	@Override
	public Boolean accepter(Personnage p) {
		return true;
	}
}
