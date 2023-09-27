package Strings;

import java.util.Scanner;

public class PalindromeWithMaxVowels {
	
	public static boolean isPalindrome(String str) {
		int n = str.length();
		for(int i = 0; i <= n/2; i++) {
			if(str.charAt(i) != str.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}

	public static int countVowels(String str) {
		String s = "aeiouAEIOU";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(s.contains(ch+"")) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String str[] = line.split(" ");
		int max = 0, pos = -1;
		for(int i = 0; i < str.length; i++) {
			int count = countVowels(str[i]);
			if(count > max && isPalindrome(str[i])) {
				max = count;
				pos = i;
			}
			
		}
		if(pos == -1 || max == 0) {
			System.out.println("No Vowels");
		}else {
			System.out.println("Max Vowels found at Position : " +pos+ " and string is " +str[pos]);
		}
		
	}
}
