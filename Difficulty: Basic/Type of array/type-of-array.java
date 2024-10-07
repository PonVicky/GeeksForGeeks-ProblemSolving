//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    int maxNtype(int arr[]) {
        // code here
        int a = 0;
        int d = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] >  arr[i+1]){
                d++;
            }else if(arr[i] < arr[i+1]){
                a++;
            }
        }
        if(d==0 && a>0){
            return 1;
        }else if(a==0 && d>0){
            return 2;
        }else if(a > d){
            return 4;
        }else if(d > a){
            return 3;
        }
        return -1;
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

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.maxNtype(arr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends