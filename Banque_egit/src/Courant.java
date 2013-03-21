/**
 * Classe représenant un compte épargne, héritée de la classe compte.
 * Un compte courant possède un découvert autorisé.
 * 
 * @author Sulivan
 * @version 1.0
 */
public class Courant extends Compte
{
	/**
	 * Découvert autorisé
	 */
	private double decouvert_autorise;
	
	/**
	 * Constructe de compte épargne.
	 * 
	 * @param client
	 * 		Le client possésseur du compte.
	 * @param numero
	 * 		Numéro du compte.
	 * @param solde
	 * 		Solde du compte.
	 * @param dec_autorise
	 * 		Découver autorisé.
	 */
	public Courant(Client client, int numero, double solde, double dec_autorise)
	{
		super(client, numero, solde);
		decouvert_autorise = dec_autorise;
	}


	/**
	 * Débite du compte le montant passé en paramètre si le
	 * solde du compte reste surpérieur au découvert autorisé.
	 * 
	 * @return 
	 * 	Vrai si le montant a bien été débité, faux sinon.
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