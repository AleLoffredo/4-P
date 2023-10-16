
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int altezza=163;
		int peso=60000;
		double altezzaMetri=(double)altezza/100.0;
		double pesoKg=(double)peso/100;
		
		double BMI=pesoKg/(altezzaMetri*altezzaMetri);
		
		System.out.println("il tuo BMI è: "+BMI);
		if(BMI<18.5) {
			System.out.print("sottopeso");
		}
		if(BMI>25) {
			System.out.print("sovrapeso");
		}
		else {
			System.out.print("normapeso");
		}

	}

}
