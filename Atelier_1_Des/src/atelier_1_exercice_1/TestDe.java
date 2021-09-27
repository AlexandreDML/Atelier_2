package atelier_1_exercice_1;

public class TestDe {

	public static void main(String[] args) {
		De de1 = new De("Agile",5);
		De de2 = new De(12);
		De de3 = new De("Agile",5);
		De de4 = new De(12);
		De de5 = new De(12);

		De_pipe de6 = new De_pipe("Souple", 20, 10);
		De_memoire de7 = new De_memoire("memoire", 10);
		
		//de2.lancer();
		//de1.setNbFaces(5);
		//System.out.println(de1);
		//System.out.println(de2);
		//System.out.println(de3);
		//System.out.println(de4);
		//System.out.println(de5);
		//System.out.println(de5.toString());
		//System.out.println(de1.equals(de3));
		
		
        //System.out.println(de6);
        //System.out.println("Le nombre est : " + de6.lancer());
	
		System.out.println(de7);
		System.out.println(de7.lancer(4));
	}

}
