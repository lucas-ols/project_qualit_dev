package main.java.VillageNoel;

public class Chalet extends Batiment{

	private Sexe sexe;

	public Chalet(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil,true);
	}
	@Override
	public Boolean accepter(Personnage p) {
		if (p.estHumanoide()) {
			if(this.getPersonnagesPresents().isEmpty()) {
				this.sexe = p.getSexe();
				System.out.println("l'enclos est vide, vous pouvez rentrée");
				return true;
			}else if(!this.getPersonnagesPresents().isEmpty()){
				if(this.sexe == p.getSexe()) {
					System.out.println("c'est bien votre dortoir, bienvenu");
					return true;
				}else {
					System.out.println("ce n'est pas votre dortoir, aurevoir");
					return false;
				}
			}
		}
		return false;
	}
}
