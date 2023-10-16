import java.io.*;

public class Array {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String v[];
		BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("inserisci numero elementi: ");
		int numeroStringhe= Integer.parseInt(stdin.readLine());
		
		v= new String[numeroStringhe];
		
		for(int i=0; i<v.length; i++) {
			System.out.println("inserisci stringa numero: " +i);
			v[i]=stdin.readLine();
		}
		System.out.println("**********STAMPA**********");
		for( int i=0;i<v.lenght;i++);
		
	}

}


	