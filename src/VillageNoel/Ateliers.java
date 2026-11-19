package VillageNoel;

public class Ateliers extends Batiment{

	public Ateliers(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}

	@Override
	public Boolean accepter(Personnage p) {
		if(p.estHumanoide) {
			if(p.getClass().getSimpleName() == "Lutins" || p.getClass().getSimpleName() == "FeesDeNoel") {
				System.out.println("bienvenu a l'atelier petit " + p.getClass().getSimpleName());
				return true;
			}else {
				System.out.println("l'acces vous est interdis");
				return false;
			}
		}else {
			System.out.println("seule les humanoide peuvent rentrée");
			return false;
		}
		
		
	}
		
	}

}
