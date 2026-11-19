package VillageNoel;

import java.util.ArrayList;

public class TourHorloge extends Batiment{

	public TourHorloge(double superficie) {
		super(superficie, 0);
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

}
