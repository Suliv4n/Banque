import java.util.ArrayList;

/**
 * Classe repéresentant une banque.
 * Une banque possède des clients.
 * 
 * @author Kevin Guidé
 * @version 1.0
 */
public class Banque 
{
	/**
	 * Liste des clients de la banque.
	 */
	private	ArrayList<Client> lesClients;
	
	
	/**
	 * Constructeur de la banque.
	 */
	public Banque() 
	{
	
		lesClients = new ArrayList<Client>();
	}
	
	/**
	 * Retourne le client le plus riche de la banque.
	 * 
	 * @return
	 * 	Le client le plus riche de la banque.
	 */
	public Client clientLePlusRiche()
	{
		Client clientPlusRiche = lesClients.get(0);
		
		for(Client c : lesClients) {
			if(c.solde() >= clientPlusRiche.solde()) {
				 clientPlusRiche = c;
			}
		}
		
		return clientPlusRiche;
	}
	
	/**
	 * Retourne sous forme d'ArrayList les clients dont le compte est dans 
	 * le rouge.
	 * 
	 * @return
	 */
	public ArrayList<Client> clientAyantUnCompteDansLeRouge()
	{
		boolean vert = true;
		ArrayList<Client> clientRouge = new ArrayList<Client>();
		
		for(Client c : lesClients) {
			for (Compte co : c.getLesComptes()) {
				if(co.getSolde() < 0 && vert) {
					clientRouge.add(c);
					vert = false;
				}
			}
		}
		
		return clientRouge;
	}
	
	/**
	 * Ajoute le client passé en paramètre dans la liste des clients.
	 * 
	 * @param unClient
	 * 	Le client a ajouté.
	 */
	public void ajoutClient(Client unClient)
	{
		lesClients.add(unClient);
	}
	
}
