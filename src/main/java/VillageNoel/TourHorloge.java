package main.java.VillageNoel;

import java.util.ArrayList;

public final class TourHorloge extends Batiment{
	
	private static final TourHorloge TOUR = new TourHorloge();
	
	private TourHorloge() {
		super(560, 0, true);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return false;
	}

	public void totMagieNoel(ArrayList<Batiment> bat) {
		int somme = 0;
    	for (Batiment b : bat) {
            somme += b.getTotalMagieNoel();
        }
    	System.out.println(""
    			+ "Le total de magie de noel est de :" + somme);
	}

	public static TourHorloge getInstance() {
		return TOUR;
	}
}

