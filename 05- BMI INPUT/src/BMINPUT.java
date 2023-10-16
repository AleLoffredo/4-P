import java.io.*; 
public class BMINPUT {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Inserisci altezza: ");
		int altezza = Integer.parseInt(stdin.readLine());
		System.out.print("inserisci peso: ");
		int peso = Integer.parseInt(stdin.readLine());
		double altezzaMetri=(double)altezza/100;
		double pesoKg=(double)peso/1000;
		
		double BMI=pesoKg/(altezzaMetri*altezzaMetri);
		
		System.out.println("il tuo BMI è: "+BMI);
		if(BMI<18.5) {
			System.out.print("sottopeso");
		}
		if(BMI>25) {
			System.out.print("sovrappeso");
		}
		else {
			System.out.print("normapeso");
		}

	}

}
//dati n numeri interi fare la media dei positivi

