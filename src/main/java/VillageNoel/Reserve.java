package main.java.VillageNoel;

import java.util.HashMap;
import java.util.Map;

public class Reserve extends Batiment{
	private static final int capacite_accueil = 0;

	private Nourriture biscuit = Nourriture.BISCUIT ; 
	private Nourriture chocolat = Nourriture.CHOCOLATS_CHAUDS ; 
	private Nourriture guimauve = Nourriture.GUIMAUVES ; 
	private Nourriture gruau = Nourriture.GRUAU_D_AVOINE ; 
	private Nourriture sucre_d_orge = Nourriture.SUCRE_D_ORGE ; 
	private Nourriture bonbons = Nourriture.BONBONS ;

	Map<Nourriture, Integer> Stock = new HashMap<>(Map.of(
		biscuit,100,
		chocolat,100,
		guimauve,100,
		gruau,100,
		sucre_d_orge,100,
		bonbons,100
	));

	public void diminu(Nourriture n){
		Stock.put(n, Stock.get(n) + 1);
	}

	public Boolean enStock(Nourriture n){
		int tot = Stock.get(n);
		if (tot > 0) {
			return true;
		}else{
			return false;
		}
	}

	public Reserve(double superficie) {
		super(superficie, capacite_accueil, true);
	}

	@Override
	public Boolean accepter(Personnage p) {
		return false;
	}


}
