package main.java.VillageNoel;

public class BureauxDePoste extends Batiment{

	public BureauxDePoste(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil, true);
	}

	@Override
	public Boolean accepter(Personnage p) {
		if(p.estHumanoide()) {
			if(p.getClass().getSimpleName() == "ElfesPostiers") {
				System.out.println("bienvenu au ureau de poste");
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
