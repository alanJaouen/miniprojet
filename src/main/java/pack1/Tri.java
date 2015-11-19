package pack1;

public class Tri {
	
	private int[] t;
	
	public int[] getTab() {
		return t;
	}

	
	public void setTab( int[] tab)
	{
		this.t=tab;
	}
	public void trier() throws TriException
	{
		if(this.t.length==0)
			throw new TriException("Tableau Vide");
		   for (int i=0 ;i<=(t.length-2);i++)
               for (int j=(t.length-1);i < j;j--)
                       if (t[j] < t[j-1])
                       {
                               int x=t[j-1];
                               t[j-1]=t[j];
                               t[j]=x;
                       }
	}
	
	public class TriException extends Exception
	{

		public TriException() {
			super();
		}

		public TriException(String arg0) {
			super(arg0);
		}
		
	}

}
