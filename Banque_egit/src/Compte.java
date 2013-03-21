/**
 * Classe abstraite représentant un compte.
 * Un compte possède :
 * <ul>
 * <li> Un client </li>
 * <li> Un numéro </li>
 * <li> Un solde </li>
 * </ul>
 * @author Sulivan Bochant
 * @version 1.0
 * 
 * @see Courant
 * @see Epargne
 */
public abstract class Compte
{
	protected Client client;
	protected int numero;
	protected double solde;

	/**
	 * Permet de créer un compte
	 * 
	 * @param client
	 * 		Le client possesseur du compte.
	 * @param numero
	 * 		Numéro du compte.
	 * @param solde
	 * 		Solde du compte.
	 */
	public Compte(Client client, int numero, double solde)
	{
		this.client = client;
		this.numero = numero;
		this.solde = solde;
	}

	/**
	 * Permet de créditer un compter.
	 * 
	 * @param montant
	 *		Montant à créditer.
	 */
	public void crediter(double montant)
	{
		solde+=montant;
	}

	/**
	 * Permet de débiter un compte si le solde du compte reste positif..
	 * 
	 * @param montant
	 * 		Montant à débiter.
	 * @return True si l'opération est réalisable (montant < solde), sinon False.
	 */
	public boolean debiter(double montant)
	{
		if(solde - montant >= 0)
		{
			solde -= montant;
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return le solde du compte
	 */
	public double getSolde()
	{
		return solde;
	}

	/**
	 * Permet de transferer un montant d'un compte à un autre.
	 * 
	 * @param montant
	 * @param destinataire
	 * @return True si le transfert est réalisable (montant < solde), sinon False.
	 */
	public boolean transfert(int montant, Compte destinataire)
	{
		if(debiter(montant))
		{
			destinataire.crediter(montant);
			return true;
		}
		return false;
	}

	/**
	 * Permet de comparer le solde de deux comptes.
	 * 
	 * @param compte
	 * @return True si le compte dispose d'un solde supérieur au second, False si inférieur
	 */
	public boolean comparer(Compte compte)
	{
		return this.solde >= compte.solde;
	}
}
