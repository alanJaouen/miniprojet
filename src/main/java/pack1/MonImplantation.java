package pack1;

import java.io.InputStream;

public class MonImplantation implements MaPremiereInterface, MaDeuxiemeInterface{

	/**
	 * 
	 * @return 1 si ok
	 */
	@Override
	public float methode() {
		return 1;
	}

	/**
	 * Methode à tester en premier
	 * @param i
	 * @throws Exception si i=0
	 */
	@Override
	public void methode1(int i) throws Exception {
		if(i == 0){
			throw new Exception();			
		}
	}

	/**
	 * Ce traitement doit se faire en moins de deux secondes
	 */
	@Override
	public void grosTraitement() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param inputStream stream vers un fichier
	 * @return 0 si fonctionne bien
	 */
	@Override
	public int gestionFichier(InputStream inputStream) {
		return 0;
	}

}
