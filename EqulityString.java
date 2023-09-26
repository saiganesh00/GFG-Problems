package Strings;

import java.util.Scanner;

public class EqulityString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int countDigits = 0, countUpperCase = 0, countLowerCase = 0, countSymbols = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				countDigits++;
			}
			else if(Character.isLowerCase(ch)) {
				countLowerCase++;
			}
			else if(Character.isUpperCase(ch)) {
				countUpperCase++;
			}
			else if(!Character.isWhitespace(ch)) {
				countSymbols++;
			}
			
		}
		if(countDigits == countUpperCase && countUpperCase == countLowerCase && countLowerCase == countSymbols) {
			System.out.println("Equality String");
		}else {
			System.out.println("Not an Equality String");
		}
	}

}
