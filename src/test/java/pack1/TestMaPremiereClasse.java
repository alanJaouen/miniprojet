package pack1;


public class TestMaPremiereClasse {
	MaPremiereInterface i;
	Integer x;
	
	public TestMaPremiereClasse()
	{
		Object tab[] = {new Integer(1), new Integer(2), new Integer(3)};
		x
		i.setTab(tab);
	}
	
	
	public boolean testTrouve1()
	{
		//si trouve l'element affiche l'element, la case
		if (i.cherche(new Integer(1)) == new Integer(1)) return true;
		return false;
	}
	
	public boolean testTrouvePas()
	{
		//si trouve pas affiche message non trouve
		if (i.cherche(3) == 0) return true;
		return false;
	}
	
	public boolean testTrouve2()
	{
		//Si trouve plusieurs fois affiche l'element, les cases, le nb d'occurrences
		if (i.cherche(2) == 2) return true;
		return false;
	}
	
}