package retake_java;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Main.testCaesar();
    
}
	public static String Encrpt(String input, int key) {
		//make a StringBuilder with message(encrypted)
		StringBuilder Encrypted = new StringBuilder(input);
		//write down the alphabet
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYS";
		//compute the shifted alphabet
		String ShiftedAlpabet=alphabet.substring(key)+alphabet.substring(0,key);
		//count from 0 to < length of encrypted 
		for(int i =0;i<Encrypted.length();i++) {
			//look at the ith character of encrypted 
			char curchar=Encrypted.charAt(i);
			//find index of curchar in the alphabet
			int idx=alphabet.indexOf(curchar);
			if(idx != -1) {
				//get the idxth character of shiftedAlphabet
				char newchar=ShiftedAlpabet.charAt(idx);
				//replace the ith character of encrypted with newchar
				Encrypted.setCharAt(i,newchar);
			}

		}
		
		
		
		return Encrypted.toString();
	}
	public static void testCaesar() {
		int key = 13;
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the Cipher : ");
	     String s = sc.nextLine();
	     String encrypted=Encrpt(s,key);
	     System.out.println(encrypted);

	}
}
   