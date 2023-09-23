package Arrays;
import java.util.*;

public class EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int leftSum[] = new int[n];
		int rightSum[] =  new int[n];
		leftSum[0] = a[0];
		for(int i = 1; i < n; i++) {
			leftSum[i] = a[i] + leftSum[i-1];
		}
		rightSum[n-1] = a[n-1];
		for(int i = n-2; i >= 0; i--) {
			rightSum[i] = rightSum[i+1] + a[i];
		}
		for(int i = 1; i < n-1; i++) {
			if(leftSum[i-1] == rightSum[i+1]) {
				System.out.println(a[i] + " " + i);
			}
		}
	}

}
