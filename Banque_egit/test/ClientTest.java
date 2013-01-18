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
		
		assertNotNull("Constructeur invalide", c);
	}

}
