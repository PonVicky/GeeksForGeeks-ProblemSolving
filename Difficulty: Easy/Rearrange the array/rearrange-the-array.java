//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {

    public void rearrangeArray(int arr[]) {
        // code here.
        Arrays.sort(arr);
        int n = arr.length;
        int k = 0, start = 0, end = n-1;
        int[] temp = new int[n];
        for(int i=0;i<n/2;i++){
            temp[k++] = arr[start++];
            temp[k++] = arr[end--];
        }
        if(n%2==1) temp[k] = arr[end];
        
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            obj.rearrangeArray(arr);
            for (int i : arr) System.out.print(i + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends