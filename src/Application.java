import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		ArrayList<Character> motlist = tirerMotAleatoirement();
		Scanner s = new Scanner(System.in);
		ArrayList<Character> motuser  = new ArrayList<Character>();
		System.out.println("Voici le tirage :" + melanger(motlist));
		System.out.println("Quel est le mot caché derrière ce tirage ? ");

		String user = s.nextLine();
		
		for(i = 0;i < user.length();i++) {
			motuser.add(user.charAt(i));
		}
	
		if(bonnesLettres(motlist, motuser) == true) {
			System.out.println("SUCCES");
		} else {
			System.out.println("ECHEC");
		}
	}
	
	public static ArrayList<Character> tirerMotAleatoirement() {
		String[] arrayString = new String[10];
		int i = 0;
		Random r = new Random();
		arrayString[0] = "paris";
		arrayString[1] = "lisbonne";
		arrayString[2] = "rennes";
		arrayString[3] = "anverre";
		arrayString[4] = "lyon";
		arrayString[5] = "lille";
		arrayString[6] = "barcelone";
		arrayString[7] = "amsterdam";
		arrayString[8] = "bruxelle";
		arrayString[9] = "marseille";
		
		int randomint = r.nextInt(0, 9);
		char[] re = arrayString[randomint].toCharArray();
		ArrayList<Character >chararray = new ArrayList<Character>();
		for(i = 0; i < re.length; i++) {
			chararray.add(re[i]); 
		}
		return chararray;
	}
	
	public static ArrayList<Character> melanger (ArrayList<Character> t) {
		Collections.shuffle(t);
		return t;
		
	}
	
	public static boolean bonnesLettres(ArrayList<Character> arrayConsole, ArrayList<Character> arrayUser) {
		int i = 0;
		boolean b = false;
		//System.out.println(arrayUser.size());
		System.out.println(arrayConsole);


		if(arrayConsole.size() != arrayUser.size()) {
			return false;
		}
		for(i=0;i<arrayUser.size();i++) {
			if(arrayConsole.contains(arrayUser.get(i))) {
				b = true;
			} else {
				b =  false;
				break;
			}
		}
		
		return b;
	}
	
	public static boolean sontIdentiques(ArrayList<Character> arrayConsole, ArrayList<Character> arrayUser) {
		return arrayConsole.equals(arrayUser);
	}

}
