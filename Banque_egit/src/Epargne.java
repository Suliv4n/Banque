/**
 * Classe repr�sentant un compte �pargne, h�rit�e de la classe compte.
 * Le compte �pargne poss�de un taux d'int�r�t.
 * 
 * @author Sul
 * @verion 1.0
 */
public class Epargne extends Compte
{
	/**
	 * Taux d'int�r�t du compte en pourcentage.
	 */
	private double tauxInteret; // en pourcentage

	/**
	 * Constructeur de Epargne.
	 * 
	 * @param client
	 * 		Client poss�sseur du compte.
	 * @param numero
	 * 		Num�ro du compte.
	 * @param solde
	 * 		Solde du compte.
	 * @param ti
	 * 		taux d'int�r�t du compte.
	 */
	public Epargne(Client client, int numero, double solde, double ti)
	{
		super(client, numero, solde);
		tauxInteret = ti;
	}

	/**
	 * Retourne le solde du compte en prenant en compte le 
	 * taux d'int�r�t.
	 * 
	 * @return le solde du compte en fonction du taux d'int�r�t.
	 */
	@Override
	public double getSolde()
	{
		return solde*(tauxInteret/100+1);
	}
}