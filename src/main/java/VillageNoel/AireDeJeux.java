package main.java.VillageNoel;

public class AireDeJeux extends Batiment{
	public AireDeJeux(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}
	@Override
	public Boolean accepter(Personnage p) {
		return true;
	}
}

