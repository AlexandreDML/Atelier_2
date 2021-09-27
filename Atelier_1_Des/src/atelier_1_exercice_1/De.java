package atelier_1_exercice_1;

import java.util.*;

public class De {
	//constructor
		protected String nom;
		protected int nbFaces = 6;
		protected static Random r = new Random();
		private static int nbDes = 0;
		private int max;
		
		public De(String nom, int nbFaces){
			this.nbFaces = nbFaces;
			this.nom = nom;
			nbDes++;
		}
		public De(String nom) {
			this.nom = nom;
		}
		public De(int nbFaces) {
			this("De n°"+ nbDes);
			nbDes++;
			this.nbFaces = nbFaces;
			if (nbFaces >= 3 && nbFaces<= 120) {
				this.nbFaces = nbFaces;
			}else {
				System.err.println("Erreur le nombre de faces du dé "+nom+ " n'est pas valide !");
			}
		}
		
		//method
		public void setNbFaces(int val){
			if (val >= 3 && val <= 120) {
				nbFaces = val;
			}else {
				System.err.println("Erreur le nombre de faces du dé "+nom+ " n'est pas valide !");
			}
		}
		public int getNbFaces(){		
			return nbFaces;
		}
		//public String toString() {
			//return "Le dé " +nom+ " ayant le nombre de faces " +nbFaces+ " est valide";
		//}
		public int lancer() {
			int nbAleatoire= r.nextInt(nbFaces);
			
			return nbAleatoire;
		}
		public int lancer(int nbLancer) {
			int max = 0;
			for (int i = 0; i < nbLancer; i++) {
				int nbAleatoire =  r.nextInt(nbFaces); //aleatoire = lancer();
				if (nbAleatoire  > max) 
					max = nbAleatoire ;
			}
		return max;
		
		}
		public String toString() {
			return "Le Dé " +nom+ " possède " +nbFaces+ " faces. "+
					"Lors du tirage le meilleur lancé est " +max;//+ " sur 10 lancés et c'est le dé " +nom
		}
		public boolean equals(Object obj) {
		    if (this == obj)
		     return true;
		    if (obj == null)
		      return false;
		    if (getClass() != obj.getClass())
		      return false;
		    De other = (De) obj;
		    if (nbFaces != other.nbFaces)
		      return false;
		    if (nom == null) {
		      if (other.nom != null)
		        return false;
		    } else if (!nom.equals(other.nom))
		      return false;
		    return true;
		  }
}
