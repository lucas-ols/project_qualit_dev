package VillageNoel;

public class EnfantsVisiteurs extends Humanoide implements Divertir {

	public EnfantsVisiteurs(String nom, Sexe sexe, int age, int magie_noel,Batiment lieu_initial) {
		super(nom, sexe, age, magie_noel, lieu_initial);
	}

	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getSon() {
		return "HIHIHIHI";
	}

}
