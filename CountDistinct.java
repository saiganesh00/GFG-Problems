package Strings;
import java.util.*;
public class CountDistinct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		char st[] = str.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		int n = st.length;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < k; i++) {
			hs.add(st[i]);
		}
		al.add(hs.size());
		for(int i = k; i < n; i++) {
			hs.remove(st[i-k]);
			hs.add(st[i]);
			al.add(hs.size());
		}
		System.out.print(al);
		sc.close();
	}

}
