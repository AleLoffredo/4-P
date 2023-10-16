/*Dato un array di nomi di persone letti in input,
costruire un nuovo array che ha gli stessi nomi tranne per quelli che iniziano
con Anna che vanno sostituiti con Maria. Inoltre gli spazi vanno tolti e il
secondo nome va messo in minuscolo. Esempio
• Anna Rita - > Mariarita
• Annarosa -> Mariarosa
• Anna Rosaria -> Mariarosaria
• Luisa - > Luisa*/
import java.io.*;
public class CambioPrimoNome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.print("numero nomi: ");
		num=Integer.parseInt(stdin.readLine());
		String Array[]=new String [num];
		String n[]=new String[num];
		for(int i=0; i<Array.length; i++) {
			System.out.println("inserisci nomi: " +(i+1));
			Array[i]=stdin.readLine();
			n[i]=Array [i].toLowerCase();
			n[i]=Array [i].replaceAll ( "Anna" + "\\s+", "Maria" + "");
			System.out.println(n[i]);
			
			
	}

	}
	}
//esercizio numero 20
