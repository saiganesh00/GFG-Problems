/* 
    Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


    Example 1:

    Input:
    N = 5
    Arr[] = {1,2,3,-2,5}
    Output:
    9
    Explanation:
    Max subarray sum is 9
    of elements (1, 2, 3, -2, 5) which 
    is a contiguous subarray.
*/


import java.io.*;

class KadanesAlgorithm {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends

// Solution starts here
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long msf = arr[0];
        long meh = 0;
        for(int i = 0; i < n; i++){
            meh += arr[i];
            if(msf < meh){
                msf = meh;
            }
            if(meh < 0){
                meh = 0;
            }
        }
        return msf;
        
    }
    
}
