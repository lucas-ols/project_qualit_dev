package VillageNoel;

public final class MaisonDuPereNoel extends BatimentSansAccueil{
	
	private static final MaisonDuPereNoel MAISON = new MaisonDuPereNoel();
	
	private MaisonDuPereNoel() {
		super(560);
	}
	public static MaisonDuPereNoel getInstance() {
		return MAISON;
	}
}
