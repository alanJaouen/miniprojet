package pack1;

import java.io.InputStream;

public interface MaPremiereInterface {
	
	/**
	 * Methode à tester en premier
	 * @param i
	 * @throws Exception si i=0
	 */
	public void methode1(int i) throws Exception;
	
	
	/**
	 * Ce traitement doit se faire en moins de deux secondes
	 */
	public void grosTraitement();
	
	/**
	 * 
	 * @param inputStream stream vers un fichier
	 * @return 0 si fonctionne bien
	 */
	public int gestionFichier(InputStream inputStream);

}
