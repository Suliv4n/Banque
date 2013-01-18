import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ClientTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConstructeur() {
		//Client(String nom, String prenom)
		
		Client c = new Client("LePAnda", "Marie");
		
		assertNotNull("Constructeur client() invalide", c);
	}

	@Test
	public void testAjouterCompte(){
		Client c = new Client("LePAnda", "Marie");
		//Epargne(Client client, int numero, double solde, double ti)
		//public Courant(Client client, int numero, double solde, double dec_autorise)
		Compte c1 = new Epargne(c, 123, 50.00, 0); //50
		Compte c2 = new Epargne(c, 123, 50.00, 0); //100
		Compte c3 = new Courant(c, 123, 50.00, 0); //150
		Compte c4 = new Courant(c, 123, 50.00, 0); //200
		
		c.ajouterCompte(c1);
		c.ajouterCompte(c2);
		c.ajouterCompte(c3);
		c.ajouterCompte(c4);
		
		assertEquals("ajouterCompte() invalide", 4, c.getLesComptes().size());
		assertSame("ajouterCompte() invalide", c1, c.getLesComptes().get(0));
		assertSame("ajouterCompte() invalide", c2, c.getLesComptes().get(1));
		assertSame("ajouterCompte() invalide", c3, c.getLesComptes().get(2));
		assertSame("ajouterCompte() invalide", c4, c.getLesComptes().get(3));
	}
	
	@Test
	public void testSolde(){
		Client c = new Client("LePAnda", "Marie");
		//Epargne(Client client, int numero, double solde, double ti)
		//public Courant(Client client, int numero, double solde, double dec_autorise)
		Compte c1 = new Epargne(c, 123, 50.00, 0); //50
		Compte c2 = new Epargne(c, 123, 50.00, 0); //100
		Compte c3 = new Courant(c, 123, 50.00, 0); //150
		Compte c4 = new Courant(c, 123, 50.00, 0); //200
		
		c.ajouterCompte(c1);
		c.ajouterCompte(c2);
		c.ajouterCompte(c3);
		c.ajouterCompte(c4);
		
		assertEquals("Solde() invalide", 200.00, c.solde(), 00);
	}
}
