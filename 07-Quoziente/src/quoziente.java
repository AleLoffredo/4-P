//dati 2 int (positivi o nulli) calcolare il quoziente e il resto della divisione intera senza usare la div o la moltiplicazione

import java.io.*;

public class quoziente {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	 int quoziente = 0;

	System.out.println("inserisci il primo numero: ");
	int a=Integer.parseInt(stdin.readLine()); 
	System.out.println("inserisci il secondo numero: ");
	 int b=Integer.parseInt(stdin.readLine());
	
	if(a==0 && b==0) {
		System.out.print("la divisione è indeterminata");
		System.exit(-1);
	}
	 
	 if(b==0) {
		System.out.println("la divisione è impossibile");
		System.exit(-1);
	}
	 if(a<0 || b<0) {
		System.out.println("numero negativo impossibile procedere");
	 System.exit(0);
		  }
	while (a >= b)  {
	    quoziente++;
	    a = a - b;
	}
	System.out.println("il quoziente è: " +quoziente);
	System.out.print("il resto è: " +a);
	
}
	}

	

