import java.util.ArrayList;


public class Client {
	
	private ArrayList <Compte> lesComptes;
	private String nom;
	private String prenom;
	
	public Client(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
		lesComptes = new ArrayList <Compte>();
	}
	
	public double solde(){
		double solde = 0;
		for (Compte c : lesComptes){
			solde += c.getSolde();
		}
		
		return solde;
	}
	
	public void ajouterCompte(Compte unCompte){
		lesComptes.add(unCompte);
	}

	public ArrayList<Compte> getLesComptes() {
		return lesComptes;
	}
	
	
}

