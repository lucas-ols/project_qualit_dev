package VillageNoel;

public class Enclos extends Batiment{
	
	private String type_creature;

	public Enclos(double superficie, int capacite_accueil) {
		super(superficie, capacite_accueil);
	}

	@Override
	public Boolean accepter(Personnage p) {
		if(!p.estHumanoide) {
			if(personnages_presents.isEmpty()) {
				this.type_creature = p.getClass().getSimpleName();
				System.out.println("l'enclos est vide, vous pouvez rentrée");
				return true;
			}else if(!personnages_presents.isEmpty()){
				if(this.type_creature.equals(p.getClass().getSimpleName())) {
					System.out.println("les votre sont deja la, vous pouver rentrée");
					return true;
				}else {
					System.out.println("ce n'est pas vos congenere, l'entrée vous est interdite");
					return false;
				}
			}
		}else {
			System.out.println("seule les creatures peuvent rentrée");
			return false;
		}
		
		
	}

}
