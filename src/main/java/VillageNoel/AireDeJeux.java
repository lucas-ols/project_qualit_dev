package main.java.VillageNoel;

public class AireDeJeux extends Batiment{
	public AireDeJeux(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}
	@Override
	public boolean accepte(Personnage p) {
		return true;
	}
}

