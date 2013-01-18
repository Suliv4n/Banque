public class Courant extends Compte
{
	private double decouvert_autorise;

	public Courant(Client client, int numero, double solde, double dec_autorise)
	{
		super(client, numero, solde);
		decouvert_autorise = dec_autorise;
	}

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