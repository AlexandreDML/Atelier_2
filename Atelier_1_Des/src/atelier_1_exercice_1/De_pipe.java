package atelier_1_exercice_1;

public class De_pipe extends De{
		private int valMin;

		public De_pipe(String nom, int nbFaces, int valMin) {
			super(nom, nbFaces);//super() -> appel du constructeur parent 
			if (nbFaces >= 3 && nbFaces <= 120 && valMin <= nbFaces) {
				this.valMin = valMin;
			}
		}
		
		public int lancer() {
				int nbRandom = valMin+r.nextInt((nbFaces+1)-valMin); //nbrandom = lancer()
		return nbRandom;
		}
}