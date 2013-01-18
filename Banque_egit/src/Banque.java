import java.util.ArrayList;


public class Banque {

	public ArrayList<Client> lesClients;
	
	
	
	
	public Banque() {
	
		lesClients = new ArrayList<Client>();
	}
	
	
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
	
	
	public void ajoutClient(Client unClient)
	{
		lesClients.add(unClient);
	}
	
}
