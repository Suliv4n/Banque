import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCompte {

	
	private Courant compteCourant;
	private Epargne compteEpargne;
	
	@Before
	public void setUp()
	{
		compteCourant = new Courant(new Client("Jack","Sparrow"),0,4000,-500);
		compteEpargne = new Epargne(new Client("Neo","Anderson"),0,8000,4);
	}
	
	@Test
	public void testDebiter() 
	{
		assertTrue("Pb dans debiter() (Courant)",compteCourant.debiter(1000) && compteCourant.getSolde() == 3000);
		assertTrue("Pb dans debiter() (Epargne)",compteEpargne.debiter(1000) && compteEpargne.getSolde() == 7280);
		assertFalse("Pb dans debiter() (debit>solde)",compteEpargne.debiter(10000));
	}
	
	
	@Test
	public void testTransfert()
	{
		assertTrue("Transfert mal effectué",compteCourant.transfert(2000, compteEpargne) && 
				compteCourant.getSolde()== 2000 && compteEpargne.getSolde() == 10400);
		assertTrue("Transfert ne devrait pas s'effectué",!compteCourant.transfert(100000, compteEpargne) && 
				compteCourant.getSolde()== 2000 && compteEpargne.getSolde() == 10400);
	}
	
	@Test
	public void testEpargneGetSolde()
	{
		assertTrue("Probleme calcul solde dans Epargne",compteEpargne.getSolde() == 8320);
	}
}
