package pack1;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMaPremiereClasse {

	InputStream fis;
	MaPremiereInterface i;
	
	@Test(expected = Exception.class) 
	public void tesaMethode1() throws Exception{
		i.methode1(0);
	}
	
	@Test(timeout=2000)
	public void testbGrosTraitement(){
		i.grosTraitement();
	}
	
	@Before
	public void setUp() throws IOException {
		FileOutputStream fos = new FileOutputStream("Essai.txt");
		fos.write(0);
		fos.close();
		fis = new FileInputStream("Essai.txt");
		i = new MonImplantation();
	}
	
	@Test
	public void testcGestionFichier(){
		int j= i.gestionFichier(fis);
		assertTrue(j == 0);
	}

	@After
	public void tearDown() throws IOException{
		if(fis != null){
			fis.close();
		}
	}

}
