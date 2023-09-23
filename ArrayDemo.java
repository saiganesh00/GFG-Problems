package Arrays;
import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ages[], n;
		n = sc.nextInt();
		ages = new int[n];
		for(int i = 0; i < n; i++) {
			ages[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			System.out.print(ages[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(ages));
		
		 for(int i: ages) {
			 System.out.print(i+" ");
		 }
	
	}

}
