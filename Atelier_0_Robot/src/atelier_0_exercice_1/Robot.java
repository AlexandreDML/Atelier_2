package atelier_0_exercice_1;
//constructor
public class Robot {
	private String reference;
	private String nom;
	private int x;
	private int y;
	private int orientation;
	private String str_orientation;
	private static int nbRobot=1;
	
	public Robot (String nom, int x, int y, int orientation) {
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.orientation = orientation;
		this.reference = "ROB" + nbRobot;
		nbRobot++;
	}
	public void Name (String nom) {
		this.x = 0;
		this.y = 0;
		this.orientation = 1;
	}
	public void modifOrientation(int change) {
		orientation = change;
	}
	public void avancer() {
		if (x == 0 && orientation == 4) {
			x = 0;
		}
		else if (y == 0 && orientation == 3) {
			y = 0;
		}else {
			switch (orientation){
			case 1: y++;break;
			case 2: x++;break;
			case 3: y--;break;
			case 4: x--;break;
			default:;break;
			}
		}
		//System.out.println(this.nom);
		
		
	}
	//public String toString() {
		//return this.reference;
	public void afficheToi() {
		switch(orientation) {
        case 1:
            str_orientation = "Nord";
            break;
        case 2:
            str_orientation = "Est";
            break;
        case 3:
            str_orientation = "Sud";
            break;
        case 4:
            str_orientation = "Ouest";
            break;
        default:
            break;
    }
		
		//System.out.println("Nom :" +nom+ "\n" +"Reference :" +reference+ "\n" + "Position :" +x+ " , " +y+ "\n"+ "Direction :" +str_orientation);
		
	}
	public String toString() {
		switch(orientation) {
        case 1:
            str_orientation = "Nord";
            break;
        case 2:
            str_orientation = "Est";
            break;
        case 3:
            str_orientation = "Sud";
            break;
        case 4:
            str_orientation = "Ouest";
            break;
        default:
            break;
		}
		return "le robot "+this.reference+ " s'appelle " + this.nom + ", il se trouve à la position "+x+ " , " +y+ " et, il est tourné vers " +this.str_orientation;
	}
		
}
