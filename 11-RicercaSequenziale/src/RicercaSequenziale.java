import java.io.*;

public class RicercaSequenziale {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        char[] vettore = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
			
        
        System.out.print("inserisci carattere: ");
        char carattere = (char)System.in.read();
        int pos=-1;
        
        for (int i = 0; i < vettore.length; i++) {
            if (vettore[i] == carattere) {
                pos=i;
                break;
            }
        }
        
        if (pos==-1) {
            System.out.println("Il carattere " + carattere + " non è presente nel vettore.");
        } else {
            System.out.println("Il carattere " + carattere + " è presente nel vettore alla posizione: " + pos + ".");
        }
    }
	}

