package pack1;

public class Recherche {
	private int[] tab;
	
	public Recherche(int[] tab)
	{
		setTab(tab);
	}
	
	public int[] getTab()
	{
		return this.tab;
	}
	public void setTab(int[] tab)
	{
		this.tab = tab;
	}
	
	public int cherche(int n)
	{
		boolean trouve = false;
		int occurences = 0;
		int taille = tab.length;
		for (int i = 0; i < taille; i++)
		{
			if (i == n)
			{
				trouve = true;
				occurences ++;
			}
			else if (trouve == true)
			{
				break;
			}
		}
		if (occurences > 0)
		System.out.println("Trouvé!\nNombre d'occurences: "+occurences);
		else
		System.out.println("aucune occurence");
		return occurences;
	}
}