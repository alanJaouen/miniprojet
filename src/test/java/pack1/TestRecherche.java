package pack1;

import org.junit.Test;


public class TestRecherche {
	Recherche i;

	public TestRecherche()
	{
		int tab[] = {1,2,2};
		i = new Recherche(tab);
	}
	
	@Test
	public void testTrouve1() throws Exception
	{
		//si trouve l'element affiche l'element, la case
		if(i.cherche(1) != 1) throw new Exception(); 
	}
	@Test
	public void testTrouvePas()throws Exception
	{
		//si trouve pas affiche message non trouve
		if (i.cherche(3) != 0) throw new Exception();
	}
	@Test
	public void testTrouve2()throws Exception
	{
		//Si trouve plusieurs fois affiche l'element, les cases, le nb d'occurrences
		if (i.cherche(2) == 2) throw new Exception();
	}
	
	@Test
	public void testGetter() throws Exception
	{
		this.i.getTab();
	}
	
}