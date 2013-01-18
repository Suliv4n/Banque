public abstract class Compte
{
	protected Client client;
	protected int numero;
	protected double solde;


	public Compte(Client client, int numero, double solde)
	{
		this.client = client;
		this.numero = numero;
		this.solde = solde;
	}

	public void crediter(double montant)
	{
		solde+=montant;
	}

	public boolean debiter(double montant)
	{
		if(solde - montant >= 0)
		{
			solde -= montant;
			return true;
		}	
		return false;

	}


	public double solde()
	{
		return solde;
	}


	public boolean transfert(int montant, Compte destinataire)
	{
		if(debiter(montant))
		{
			destinataire.crediter(montant);
			return true;
		}
		return false;
	}

	public boolean comparer(Compte compte)
	{
		return this.solde == compte.solde;
	}
}