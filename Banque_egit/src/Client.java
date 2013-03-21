import java.util.ArrayList;


public class Client {
	
	//_-_-_-_-_-_-_Attribut_-_-_-_-_-_-_\\
	
	private ArrayList <Compte> lesComptes;
	private String nom;
	private String prenom;
	
	//_-_-_-_-_-_-_Get&Set_-_-_-_-_-_-_\\
	
	/**
	 * 
	 * @return nom Le nom du client
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * 
	 * @param nom 
	 * 	Nom du client
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * 
	 * @return prenom Le prenom du client
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * 
	 * @param prenom Prenom du client
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * 
	 * @return lesComptes Les comptes du client
	 */
	public ArrayList<Compte> getLesComptes() {
		return lesComptes;
	}
	
	/**
	 * 
	 * @param lesComptes Liste de compte du clients
	 */
	public void setLesComptes(ArrayList<Compte> lesComptes) {
		this.lesComptes = lesComptes;
	}
	
	//_-_-_-_-_-_-_Constructeur_-_-_-_-_-_-_\\
	
	/**
	 * 
	 * @param nom Nom du client
	 * @param prenom Prenom du client
	 */
	public Client(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
		lesComptes = new ArrayList <Compte>();
	}
	
	//_-_-_-_-_-_-_Méthode_-_-_-_-_-_-_\\
	
	/**
	 * 
	 * @return solde La somme des solde de tous les comtpe du client
	 */
	public double solde(){
		double solde = 0;
		for (Compte c : lesComptes){
			solde += c.getSolde();
		}
		
		return solde;
	}
	
	/**
	 * 
	 * @param unCompte Compte à ajouter au client
	 */
	public void ajouterCompte(Compte unCompte){
		lesComptes.add(unCompte);
	}


	
	
}

