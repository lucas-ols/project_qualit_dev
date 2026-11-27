package main.java.VillageNoel;

public class Enclos extends Batiment{

	private String type_creature;

	public Enclos(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil, false);
	}

	@Override
	public Boolean accepter(Personnage p) {
		if(!p.estHumanoide()) {
			if(this.getPersonnagesPresents().isEmpty()) {
				this.type_creature = p.getClass().getSimpleName();
				System.out.println("l'enclos est vide, vous pouvez rentrée");
				return true;
			}else if(!this.getPersonnagesPresents().isEmpty()){
				if(this.type_creature.equals(p.getClass().getSimpleName())) {
					System.out.println("les votre sont deja la, vous pouver rentrée");
					return true;
				}else {
					System.out.println("ce n'est pas vos congenere, l'entrée vous est interdite");
					return false;
				}
			}
		}
		System.out.println("seule les creatures peuvent rentrée");
		return false;
		
	}
}
