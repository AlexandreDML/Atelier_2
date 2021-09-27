package atelier_1_exercice_1;

public class De_memoire extends De{
	private int valMemoire;

	public De_memoire(String nom, int nbFaces){
		super(nom, nbFaces);//super() -> appel du constructeur parent 
		this.valMemoire = 0;
	}
	
	public int lancer(int nbLancer) {//enlever le param�tre
		
		int val = 0;
		for (int i = 0; i <= nbLancer; i++) {//� enlever
			while (val == valMemoire){
				 val =  r.nextInt(nbFaces); //val = superlancer()
				System.out.println("Le lanc� a fait: " + val + " et le lanc� pr�c�dent �tait: " + valMemoire);
			}
			valMemoire = val;
		}
			return val;
	}
}
