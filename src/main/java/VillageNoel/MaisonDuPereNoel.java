package main.java.VillageNoel;

public final class MaisonDuPereNoel extends Batiment{
	
	private static final MaisonDuPereNoel MAISON = new MaisonDuPereNoel();
	
	private MaisonDuPereNoel() {
		super(560, 0,true);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return false;
	}

	public static MaisonDuPereNoel getInstance() {
		return MAISON;
	}
}
