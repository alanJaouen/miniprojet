package pack1;


public class TestMaPremiereClasse {
	MaPremiereInterface i;
	
	public TestMaPremiereClasse()
	{
		int tab[] = {1,2,2};
		i = new MaPremiereInterface(tab);
	}
	
	
	public void testTrouve1() throws Exception
	{
		//si trouve l'element affiche l'element, la case
		if(i.cherche(1) != 1) throw new Exception(); 
	}
	
	public void testTrouvePas()throws Exception
	{
		//si trouve pas affiche message non trouve
		if (i.cherche(3) != 0) throw new Exception();
	}
	
	public void testTrouve2()throws Exception
	{
		//Si trouve plusieurs fois affiche l'element, les cases, le nb d'occurrences
		if (i.cherche(2) == 2) throw new Exception();
	}
	
}