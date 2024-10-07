//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
/*You are required to complete the function*/
class Solution {
    public int findMaxProduct(int[] arr, int k) {
        // code here
        int product = 1, end = 0, count = 0,max = 0;
        for(int i=0;i<arr.length;i++){
            product*=arr[i];
            count++;
            if(count  == k){
                max = Math.max(max,product);
                product/=arr[end++];
                count--;
            }
        }
        return max;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
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
            int k = Integer.parseInt(br.readLine());

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.findMaxProduct(arr, k);

            System.out.println(res);

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends