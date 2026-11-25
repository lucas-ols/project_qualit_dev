package VillageNoel;

public abstract class BatimentSansAccueil extends Batiment{
	
	protected BatimentSansAccueil(int superficie) {
		super(superficie, 0);
		
	}
	@Override
	public boolean accepte(Personnage p) {
		return false;
	}
}
