import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BanqueTest {

	Banque b;
	Client c1, c2, c3;
	Compte coGK1, coGK2, coGL1, coGL2, coBS1, coBS2;
	
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testAjoutClient() {
		
		b = new Banque();
		c1 = new Client("Guidé", "Kevin");
		b.ajoutClient(c1);
		
		assertSame("Le client n'est pas ajouté à la banque",c1 ,b.lesClients.get(0));
	}
	
	
	@Test
	public void testClientLePlusRiche() {
		
		b = new Banque();
		
		c1 = new Client("Girardin", "Lucas");
		c2 = new Client("Guidé", "Kevin");
		c3 = new Client("Bochant", "Sulivan");
		b.ajoutClient(c1);
		b.ajoutClient(c2);
		b.ajoutClient(c3);
		
		coGL1 = new Epargne(c1, 1, 20000, 10);
		coGL2 = new Courant(c1, 1, 6000, -400);
		c1.ajouterCompte(coGL1);
		c1.ajouterCompte(coGL2);
		
		coGK1 = new Epargne(c2, 1, 100000, 20);
		coGK2 = new Courant(c2, 1, 5800, -400);
		c2.ajouterCompte(coGK1);
		c2.ajouterCompte(coGK2);
		
		coBS1 = new Epargne(c3, 1, 50000, 5);
		coBS2 = new Courant(c3, 1, 4500, -100);
		c3.ajouterCompte(coBS1);
		c3.ajouterCompte(coBS2);
		
		
		
		assertSame("Ce n'est pas le client le plus riche",c2 ,b.clientLePlusRiche());
	}

}
