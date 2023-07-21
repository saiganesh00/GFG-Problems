/* 
    Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

    Example 1:

    Input:
    N = 5
    A[] = {1,2,3,5}
    Output: 4
*/
import java.util.*;
import java.io.*;
class MissingNumberInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int st = 1;
        for(int i = 0; i < n-1; i++){
            if(st == array[i]){
                st++;
            }else{
                break;
            }
        }
        return st;
    }
}