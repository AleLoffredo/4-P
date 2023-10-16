//dati n numeri interi fare la media dei positivi
import java.io.*; 
public class Media {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int som=0;
		int cont=0;
		double media;
       
        System.out.println("quanti numeri vuoi inserire?: ");
        int n=Integer.parseInt(stdin.readLine());
        
        if(n<=0) {
            System.out.println("errore: numero minore di 0");
            }
        
        for (int i = 0; i < n; i++) {
        
          System.out.println("Inserisci il " + (i + 1) + "° numero");
         int num = Integer.parseInt(stdin.readLine());
        
        if(num>0) 
        	som+=num;
        	cont++;
        if(num<=0)
        	System.out.println("numero negativo: non calcolabile");
        }
         media= (double)som/cont;
         System.out.print("la media è: " +media);
        
        
	}
	

}

