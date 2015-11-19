package pack1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import pack1.Tri.TriException;

public class TestTri {
	

	@Test
	public void testTrier1() throws TriException
	{	
		  	Tri i = new Tri();
		  	
			int[] tab={1,2,3,4,5};
			int[] tabbis={1,2,3,4,5};
	
		  	i.setTab(tab);
		  	i.trier();
		  	Assert.assertArrayEquals(tabbis, i.getTab()); // tab deja trié
		  	
	}
	
	@Test
	public void testTrier2() throws TriException
	{	
		Tri i = new Tri();
	
			int[] tab2={6,98,7,0,666};
			int[] tab2bis={0,6,7,98,666}; 
			
		  	i.setTab(tab2);
		  	i.trier();
		  	Assert.assertArrayEquals(tab2bis, i.getTab());// non trié
	}
	@Test
	public void testTrier3() throws TriException
	{	
		Tri i = new Tri();
		  	boolean t= false;
		  	
		  try
		  {
		  	int[] tab3={};
			int[] tab3bis={};
		  	
			i.setTab(tab3);
		  	i.trier();
		  	Assert.assertArrayEquals(tab3bis, i.getTab());// tab vide
			
		}
		catch (Tri.TriException e)
		{
			t=true;
		}
		 if(!t)
		 {
			 throw new AssertionError();
		 }
	}
		 @Test
			public void testTrier4() throws TriException
			{	
			 Tri i = new Tri();
		  	
			int[] tab4={1,2,3,2,5};
			int[] tab4bis={1,2,2,3,5};
	
		  	i.setTab(tab4);
		  	i.trier();
		  	Assert.assertArrayEquals(tab4bis, i.getTab()); // tab avec deux elements identiques
		  	
	}
	
}

