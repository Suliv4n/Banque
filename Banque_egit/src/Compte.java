/**
 * 
 * @author Sulivan Brochant
 *
 */
public abstract class Compte
{
	protected Client client;
	protected int numero;
	protected double solde;

	/**
	 * Permet de cr�er un compte
	 * 
	 * @param client
	 * @param numero
	 * @param solde
	 */
	public Compte(Client client, int numero, double solde)
	{
		this.client = client;
		this.numero = numero;
		this.solde = solde;
	}

	/**
	 * Permet de cr�diter un compter.
	 * 
	 * @param montant
	 */
	public void crediter(double montant)
	{
		solde+=montant;
	}

	/**
	 * Permet de d�biter un compte.
	 * 
	 * @param montant
	 * @return True si l'op�ration est r�alisable (montant < solde), sinon False.
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
	 * Permet de transferer un montant d'un compte � un autre.
	 * 
	 * @param montant
	 * @param destinataire
	 * @return True si le transfert est r�alisable (montant < solde), sinon False.
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
	 * @return True si le compte dispose d'un solde sup�rieur au second, False si inf�rieur
	 */
	public boolean comparer(Compte compte)
	{
		return this.solde >= compte.solde;
	}
}
