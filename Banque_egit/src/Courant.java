/**
 * Classe repr�senant un compte �pargne, h�rit�e de la classe compte.
 * Un compte courant poss�de un d�couvert autoris�.
 * 
 * @author Sulivan
 * @version 1.0
 */
public class Courant extends Compte
{
	/**
	 * D�couvert autoris�
	 */
	private double decouvert_autorise;
	
	/**
	 * Constructe de compte �pargne.
	 * 
	 * @param client
	 * 		Le client poss�sseur du compte.
	 * @param numero
	 * 		Num�ro du compte.
	 * @param solde
	 * 		Solde du compte.
	 * @param dec_autorise
	 * 		D�couver autoris�.
	 */
	public Courant(Client client, int numero, double solde, double dec_autorise)
	{
		super(client, numero, solde);
		decouvert_autorise = dec_autorise;
	}


	/**
	 * D�bite du compte le montant pass� en param�tre si le
	 * solde du compte reste surp�rieur au d�couvert autoris�.
	 * 
	 * @return 
	 * 	Vrai si le montant a bien �t� d�bit�, faux sinon.
	 */
	@Override 
	public boolean debiter(double montant)
	{
		if(solde - montant >= decouvert_autorise)
		{
			solde -= montant;
			return true;
		}
		return false;
	}

}