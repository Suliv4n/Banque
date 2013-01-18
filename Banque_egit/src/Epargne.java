public class Epargne extends Compte
{
	private double tauxInteret; // en pourcentage

	public Epargne(Client client, int numero, double solde, double ti)
	{
		super(client, numero, solde);
		tauxInteret = ti;
	}

	@Override
	public double getSolde()
	{
		return solde*(tauxInteret/100+1);
	}
}