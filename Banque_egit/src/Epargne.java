/**
 * Classe représentant un compte épargne, héritée de la classe compte.
 * Le compte épargne possède un taux d'intérêt.
 * 
 * @author Sul
 * @verion 1.0
 */
public class Epargne extends Compte
{
	/**
	 * Taux d'intérêt du compte en pourcentage.
	 */
	private double tauxInteret; // en pourcentage

	/**
	 * Constructeur de Epargne.
	 * 
	 * @param client
	 * 		Client possésseur du compte.
	 * @param numero
	 * 		Numéro du compte.
	 * @param solde
	 * 		Solde du compte.
	 * @param ti
	 * 		taux d'intérêt du compte.
	 */
	public Epargne(Client client, int numero, double solde, double ti)
	{
		super(client, numero, solde);
		tauxInteret = ti;
	}

	/**
	 * Retourne le solde du compte en prenant en compte le 
	 * taux d'intérêt.
	 * 
	 * @return le solde du compte en fonction du taux d'intérêt.
	 */
	@Override
	public double getSolde()
	{
		return solde*(tauxInteret/100+1);
	}
}