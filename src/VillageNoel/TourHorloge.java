package VillageNoel;

public final class TourHorloge extends BatimentSansAccueil{
	
	private static final TourHorloge TOUR = new TourHorloge();
	
	private TourHorloge() {
		super(560);
	}
	public static TourHorloge getInstance() {
		return TOUR;
	}
}

