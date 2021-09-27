package atelier_1_exercice_1;

public class De_memoire extends De{
	private int valMemoire;

	public De_memoire(String nom, int nbFaces){
		super(nom, nbFaces);//super() -> appel du constructeur parent 
		this.valMemoire = 0;
	}
	
	public int lancer(int nbLancer) {//enlever le paramètre
		
		int val = 0;
		for (int i = 0; i <= nbLancer; i++) {//à enlever
			while (val == valMemoire){
				 val =  r.nextInt(nbFaces); //val = superlancer()
				System.out.println("Le lancé a fait: " + val + " et le lancé précédent était: " + valMemoire);
			}
			valMemoire = val;
		}
			return val;
	}
}
