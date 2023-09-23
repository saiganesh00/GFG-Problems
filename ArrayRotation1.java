package Arrays;
import java.util.*;
public class ArrayRotation1 {

	public static void reverse(int x[], int si, int ei) {
		while(si < ei) {
			int temp = x[si];
			x[si] = x[ei];
			x[ei] = temp;
			si++;
			ei--;
		}
	}
	public static void rotate(int arr[], int k) {
		if(k == 0 || k == arr.length || arr.length == 1) {
			return;
		}
		k = k % arr.length;
		reverse(arr, arr.length - k, arr.length-1);
		reverse(arr, 0, arr.length - k - 1);
		reverse(arr, 0, arr.length-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			rotate(a, k);
			for(int i = 0; i < n-1; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.print(a[n-1]);
		}
		sc.close();
	}

}
