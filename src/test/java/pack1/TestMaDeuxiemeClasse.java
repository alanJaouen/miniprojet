package pack1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaDeuxiemeClasse {

	@Test
	public void testMethode(){
		MaDeuxiemeInterface i = new MonImplantation();
		float f = i.methode();
		assertTrue(f == 1);
	}
}

