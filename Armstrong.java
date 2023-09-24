package Numbers;
import java.util.*;
public class Armstrong {
	public static boolean isArmstrong(int n) {
		int ct = (int)Math.log10(n) + 1;
		int sum = 0, r, temp;
		temp = n;
		while(n > 0) {
			r = n % 10;
			sum = sum + (int)Math.pow(r, ct);
			n = n / 10;
		}
		if(sum == temp) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(isArmstrong(num)) {
			System.out.println(num+" is armstrong");
		}
		else {
			System.out.println(num+" is not armstrong");
		}
		sc.close();
	}

}
