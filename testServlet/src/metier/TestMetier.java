package metier;

public class TestMetier {

	public static void main(String[] args) {
		SommeMetierImpl metier = new SommeMetierImpl();
		double v1=3;
		double v2=6;
		double s=metier.calculerSomme(v1, v2);
		System.out.println("La somme est :"+s);
		}
	
}
