package VillageNoel;

public class Lycanthropes extends Creature{

	public Lycanthropes(String nom, Sexe sexe, int age, int magie_noel, Batiment lieu_initial) {
		super(nom, sexe, age, magie_noel, lieu_initial);
	}

	@Override
	protected String getSon() {
		return "HAhaaaaAH";
	}
}
